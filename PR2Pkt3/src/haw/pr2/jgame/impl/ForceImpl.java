package haw.pr2.jgame.impl;

import haw.pr2.jgame.Factory;
import haw.pr2.jgame.interfaces.Acc;
import haw.pr2.jgame.interfaces.Force;
import haw.pr2.jgame.interfaces.Length;
import haw.pr2.jgame.interfaces.Mass;
import haw.pr2.jgame.interfaces.Speed;

public class ForceImpl extends AbstractValuesImpl<Force> implements Force
{

	public static Force valueOf(double inValue)
	{
		return new ForceImpl(inValue);
	}

	private ForceImpl(double value)
	{
		super(value);
	}

	@Override
	public boolean checkInstance(Object obj) {
		return obj instanceof Force;
	}
	
	@Override
	public Force fromPrototype(double value)
	{
		return valueOf(value);
	}
	
	

	@Override
	public Force div(double other)
	{
		return fromPrototype(Factory.forceInNewton(this.value()).value() / other);
	}

	@Override
	public Force mul(double other)
	{
		return fromPrototype(Factory.forceInNewton(this.value()).value() * other);
	}


	@Override
	public Acc div(Mass mass)
	{
		return AccImpl.valueOf(Factory.forceInNewton(this.value()).value() / Factory.massInKilogramm(mass.value()).value());
	}

	@Override
	public Mass div(Acc acc)
	{
		return MassImpl.valueOf(Factory.forceInNewton(this.value()).value() / Factory.accInMeterProSeKundeQuadrat(acc.value()).value());
	}
}
