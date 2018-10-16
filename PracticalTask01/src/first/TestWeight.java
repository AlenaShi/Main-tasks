package first;

public class TestWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstDinoKg = 12;
		
		double mg = WeightOfDino.calcMg(firstDinoKg);
		double g = WeightOfDino.calcGram(firstDinoKg);
		double ton = WeightOfDino.calcTon(firstDinoKg);
		
		System.out.println("Weight of dino " + mg + " mg");
		System.out.println("Weight of dino " + g + " g");
		System.out.println("Weight of dino " + ton + " ton");
	}

}
