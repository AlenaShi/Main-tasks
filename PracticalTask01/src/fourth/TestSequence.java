package fourth;

public class TestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1234;
		double b = 9641;
		double c = 1926;
		
		boolean aAsc = Sequence.isAscending(a);
		boolean cAsc = Sequence.isAscending(c);
		boolean bAsc = Sequence.isAscending(b);
		boolean aDes = Sequence.isDescending(a);
		boolean bDes = Sequence.isDescending(b);
		boolean cDes = Sequence.isDescending(c);
		
		System.out.println("Is "+ a + " ascending sequence? " + aAsc);
		System.out.println("Is "+ c + " ascending sequence? " + cAsc);
		System.out.println("Is "+ b + " ascending sequence? " + bAsc);
		System.out.println("Is "+ a + " descending sequence? " + aDes);
		System.out.println("Is "+ b + " descending sequence? " + bDes);
		System.out.println("Is "+ c + " ascending sequence? " + cDes);
		
	}

}
