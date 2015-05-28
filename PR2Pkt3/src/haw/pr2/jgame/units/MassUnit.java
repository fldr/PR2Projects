package haw.pr2.jgame.units;

public enum MassUnit {
	KILOGRAMM(1.0);

	

	private double factor;

	private MassUnit(double factor) {
		this.factor = factor;
	}

	public double getFactor() {
		return factor;
	}
}
