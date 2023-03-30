import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        boolean validInput = false;
        
        while(!validInput) {
        	
        	System.out.println("Encode/Decode? ");
            Scanner scanner = new Scanner(System.in);
        	String input = scanner.next();
        	
	        switch(input) {
	        
	        	case "Stop":
	        		validInput = true;
	        		System.exit(0);
	        		
	        	case "Encode":
	        		System.out.println("Enter n: ");
	        		int x = scanner.nextInt();
	        		Encode.encode(x);
	        		break;
	        		
	        	case "Decode":
	        		System.out.println("Enter n: ");
	        		int y = scanner.nextInt();
	        		Decode.decode(y);
	        		break;
	        		
	        	default:
	        		System.out.println("Please enter either Stop/Encode/Decode");
	        		break;
	        }
	        
        }
        
    }
}