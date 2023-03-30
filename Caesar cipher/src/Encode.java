import java.util.Scanner;

public class Encode {
	public static void encode(int n) {
		
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter text to encode: ");
        String text = scanner.nextLine();
        
		char[] letters = text.replaceAll(" ", "").toCharArray();
		int[] uniCode = new int[letters.length];
				
		for(int i = 0; i < letters.length; i++) {
			uniCode[i] = (int) letters[i];
			System.out.print(Character.toUpperCase(letters[i]));
		}
		
		System.out.println();
		
		for(int i = 0; i < uniCode.length; i++) {
			System.out.print((char) (uniCode[i] + n));
		}
		
		System.out.println();
		System.out.println();
		
	}
}
