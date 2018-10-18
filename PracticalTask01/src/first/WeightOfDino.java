package first;

public class WeightOfDino {
	public static final int KG_TO_MG = 1000000;
	public static final int KG_TO_G = 1000;
	public static final double KG_TO_TON = 0.001;

	public static double calcMg(double weight) {
		return weight * KG_TO_MG;
	}

	public static double calcGram(double weight) {
		return weight * KG_TO_G;
	}

	public static double calcTon(double weight) {
		return weight * KG_TO_TON;
	}
}
