package haw.pr2.jgame.impl;

import static com.google.common.base.Preconditions.checkNotNull;
import haw.pr2.jgame.Factory;
import haw.pr2.jgame.interfaces.Force;
import haw.pr2.jgame.interfaces.Length;
import haw.pr2.jgame.interfaces.Power;
import haw.pr2.jgame.interfaces.Speed;
import haw.pr2.jgame.interfaces.TimeDiff;

public class SpeedImpl extends AbstractValuesImpl<Speed> implements Speed {
	
	  public static Speed valueOf(double inValue) {
	        return new SpeedImpl(inValue);
	    }
	
	private SpeedImpl(double value) {
		super(value);
	}
	
	@Override
	public Speed fromPrototype(double value) {
		return valueOf(value);
	}
	
	@Override
	public boolean checkInstance(Object obj) {
		return obj instanceof Speed;
	}
	
	@Override
	public Speed div(double other) {
		checkNotNull(other);
		checkNotNull(other > 0);
		return fromPrototype(Factory.speedInMeterProSeKunde(this.value()).value() / other);
	}

	@Override
	public Speed mul(double other) {
		return fromPrototype(Factory.speedInMeterProSeKunde(this.value()).value() * other);
	}

	@Override
	public Length mul(TimeDiff timeDiff) {
		return LengthImpl.valueOf(Factory.speedInMeterProSeKunde(this.value()).value() * timeDiff.value());
	}

	@Override
	public Force dragForce(Speed maxSpeed, Power maxPower)
	{
		return ForceImpl.valueOf(maxSpeed.value() * maxSpeed.value()* maxPower.value());
	}

	
}