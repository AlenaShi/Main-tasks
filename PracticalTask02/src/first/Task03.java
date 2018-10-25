package first;

public class Task03 {
	public static boolean isVowel1(char a) {
		return a == 'a' || a == 'A' || a == 'o' || a == 'O' || a == 'u' || a == 'U' || a == 'i' || a == 'I' || a == 'e'
				|| a == 'E';
	}

	public static String isVowel2(char a) {
		String result = "";
		if (a == 'a' || a == 'A' || a == 'o' || a == 'O' || a == 'u' || a == 'U' || a == 'i' || a == 'I' || a == 'e'
				|| a == 'E') {
			result = "This is a vowel.";
		} else if (a == 'y' || a == 'Y') {
			result = "Sometimes is a vowel.";
		} else {
			result = "Not a vowel.";
		}
		return result;
	}

	public static String isVowel3(char a) {
		String result = "";
		switch (a) {
		case 'a':
		case 'u':
		case 'o':
		case 'i':
		case 'e':
		case 'A':
		case 'U':
		case 'O':
		case 'I':
		case 'E':
			result = "This is a vowel.";
			break;
		case 'y':
		case 'Y':
			result = "Sometimes is a vowel.";
			break;
		default:
			result = "Not a vowel.";
		}
		return result;
	}
}
