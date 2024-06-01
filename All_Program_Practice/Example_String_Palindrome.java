package All_Program_Practice;

public class Example_String_Palindrome {

	static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "madam";
		String str2 = "geeks";

		str = str.toLowerCase();
		str2 = str2.toLowerCase();

		System.out.println("string 1: ");

		if (isPalindrome(str)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not palindrome");
		}
		System.out.println();

		System.out.println("String 2 : ");
		if (isPalindrome(str2))
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
	}
}
