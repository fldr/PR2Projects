package haw.pr2.jgame.impl;

import haw.pr2.jgame.interfaces.Acc;
import haw.pr2.jgame.interfaces.Force;
import haw.pr2.jgame.interfaces.Length;
import haw.pr2.jgame.interfaces.Mass;
import haw.pr2.jgame.interfaces.Power;
import haw.pr2.jgame.interfaces.Speed;
import haw.pr2.jgame.interfaces.TimeDiff;
import haw.pr2.jgame.interfaces.Work;
import haw.pr2.jgame.units.AccUnit;
import haw.pr2.jgame.units.ForceUnit;
import haw.pr2.jgame.units.LengthUnit;
import haw.pr2.jgame.units.MassUnit;
import haw.pr2.jgame.units.Multiplier;
import haw.pr2.jgame.units.PowerUnit;
import haw.pr2.jgame.units.TimeUnit;
import haw.pr2.jgame.units.WorkUnit;

public class Factory {
	
	private Factory(){}
	
	/*****************************Acc*************************/
	public static Acc acc(double value) {
		return AccImpl.valueOf(value);
	}
	
	public static Acc acc(double value, AccUnit unit, Multiplier multiplier) {
		return AccImpl.valueOf(value * unit.getFactor() * multiplier.getMultiplier());
	}
	
	public static Acc accInMeterProSeKundeQuadrat(double meterProSecQuadrat) {
		return acc(meterProSecQuadrat, AccUnit.METERINSECQUADRAT, Multiplier.NONE);
	}
	
	
	/******************************Length*********************/
    public static Length lengthInMeter(double meter) {
        return length(meter, LengthUnit.METER, Multiplier.NONE);
    }
    
    public static Length lengthInFeet(double meter) {
    	return length(meter, LengthUnit.FEET, Multiplier.NONE);
    }
    
    public static Length lengthInKm(double meter) {
    	return length(meter, LengthUnit.METER, Multiplier.MILLI);
    }

    public static Length length(double value, LengthUnit unit, Multiplier multiplier) {
        return LengthImpl.valueOf(value * unit.getFactor() * multiplier.getMultiplier());
        }
        
    public static Length length(double value) {
            return LengthImpl.valueOf(value);     
    }
    
    /******************************Mass**********************/
    public static Mass massInKilogramm(double kilogramm) {
        return mass(kilogramm, MassUnit.KILOGRAMM, Multiplier.NONE);
    }
    
    public static Mass massInGramm(double kilogramm) {
    	return mass(kilogramm, MassUnit.KILOGRAMM, Multiplier.MILLI);
    }
    
    public static Mass mass(double value, MassUnit unit, Multiplier multiplier){
    	return MassImpl.valueOf(value * unit.getFactor() * multiplier.getMultiplier());
    }
    
    public static Mass mass(double value){
    	return MassImpl.valueOf(value);
    }
    
    
    /******************************Time*********************/
    public static TimeDiff timeInSec(double s) {
    	return time(s, TimeUnit.SEC, Multiplier.NONE);
    }
    
    public static TimeDiff timeInHour(double h) {
    	return time(h, TimeUnit.HOUR, Multiplier.NONE);
    }
    
    public static TimeDiff timeHourInSec(double h) {
    	return time(h, TimeUnit.HOUR, Multiplier.HOURINSEC);
    }
    
    public static TimeDiff time(double value, TimeUnit unit, Multiplier multiplier){
    	return TimeDiffImpl.valueOf(value * unit.getFactor() * multiplier.getMultiplier());
    }
    
    public static TimeDiff time(double value){
    	return TimeDiffImpl.valueOf(value);
    }
    
    /******************************Power*********************/
    public static Power powerInWatt(double watt) {
    	return power(watt, PowerUnit.WATT, Multiplier.NONE);
    }
    
    public static Power powerKilowattInWatt(double kiloWatt) {
    	return power(kiloWatt, PowerUnit.WATT, Multiplier.KILO);
    }
    
    public static Power power(double value, PowerUnit unit, Multiplier multiplier){
    	return PowerImpl.valueOf(value * unit.getFactor() * multiplier.getMultiplier());
    }
    
    public static Power power(double value){
    	return PowerImpl.valueOf(value);
    }
    
    /******************************Speed*********************/
    public static Speed speedInMeterProSeKunde(double meterProSec) {
    	return speed(meterProSec, LengthUnit.METER, Multiplier.NONE);
    }
    
    public static Speed speedInMeterProSeKundeVonKmProStunde(double kmProHour) {
    	return speed(kmProHour, LengthUnit.METER, Multiplier.KMPROSTUNDEINMETERPROSEKUNDE);
    }
    
    public static Speed speed(double value, LengthUnit unit, Multiplier multiplier){
    	return SpeedImpl.valueOf(value * unit.getFactor() * multiplier.getMultiplier());
    }
    
    public static Speed speed(double value){
    	return SpeedImpl.valueOf(value);
    }
    
    
    /******************************Work*********************/
    
    public static Work workInNewtonMeter(double kmProHour) {
    	return work(kmProHour, WorkUnit.NEWTONMETER, Multiplier.NONE);
    }
    
    public static Work work(double value, WorkUnit unit, Multiplier multiplier){
    	return WorkImpl.valueOf(value * unit.getFactor() * multiplier.getMultiplier());
    }
    
    public static Work work(double value){
    	return WorkImpl.valueOf(value);
    }
    
    /*****************************Force*********************/
    
    public static Force forceInNewton(double force) {
    	return force(force, ForceUnit.NEWTON, Multiplier.NONE);
    }
    
    public static Force force(double value, ForceUnit unit, Multiplier multiplier){
    	return ForceImpl.valueOf(value * unit.getFactor() * multiplier.getMultiplier());
    }
    
    public static Force force(double value){
    	return ForceImpl.valueOf(value);
    }
}
