package haw.pr2.jgame;

import haw.pr2.jgame.impl.LengthImpl;
import haw.pr2.jgame.interfaces.Length;
import haw.pr2.jgame.units.LengthUnit;
import haw.pr2.jgame.units.Multiplier;

public class Factory {
	
	private Factory(){}
	
    public static Length lengthInMeter(double meter) {
        return length(meter, LengthUnit.METER, Multiplier.NONE);
    }

    
    public static Length length(double value, LengthUnit unit, Multiplier multiplier) {
        return LengthImpl.valueOf(value * unit.getFactor() * multiplier.getMultiplier());
    }
}