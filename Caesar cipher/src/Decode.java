import java.util.Scanner;

public class Decode {
	public static void decode(int n) {
		
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter text to decode: ");
        String input = scanner.nextLine();
        
		char[] encoded = input.toCharArray();
		int[] uniCode = new int[encoded.length];
				
		for(int i = 0; i < encoded.length; i++) {
			uniCode[i] = (int) encoded[i];
			System.out.print(Character.toUpperCase(encoded[i]));
		}
		
		System.out.println();
		
		for(int i = 0; i < uniCode.length; i++) {
			System.out.print((char) (uniCode[i] - n));
		}
		
		System.out.println();
		System.out.println();
		
	}
}
