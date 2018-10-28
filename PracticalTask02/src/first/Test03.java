package first;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		char b = 'b';

		boolean resultVowel1A = Task03.isVowel1(a);
		boolean resultVowel1B = Task03.isVowel1(b);
		String resultVowel2A = Task03.isVowel2(a);
		String resultVowel2B = Task03.isVowel2(b);
		String resultVowel3A = Task03.isVowel3(a);
		String resultVowel3B = Task03.isVowel3(b);

		View.log("Is a a vowel? " + resultVowel1A);
		View.log("Is b a vowel? " + resultVowel1B);
		View.log("Is a a vowel? " + resultVowel2A);
		View.log("Is b a vowel? " + resultVowel2B);
		View.log("Is a a vowel? " + resultVowel3A);
		View.log("Is b a vowel? " + resultVowel3B);
	}

}
