//import java.util.Scanner;

public class DivisibleBy3 {

	
	public static boolean divby3(int userNum) {
		
		String numstr = Integer.toString(userNum);
		
		if(numstr.length() ==1) {
			
			char digit = numstr.charAt(0);
			if(digit == '3' || digit == '6' || digit == '9') {
			
				return true;
			}
			else {
				return false;
				
			}
			
			
		}
		
		int sum = 0;
		
		for (int i = 0; i < numstr.length(); ++i) {
			
			
			char digit = numstr.charAt(i);
			

			int digitVal = Character.getNumericValue(digit);
			
	         sum += digitVal;	
	        
		}

		return divby3(sum);
		
		
	 }
	     
	 public static boolean divby2(int userNum) {
		 
		 String numstr = Integer.toString(userNum);
		 
		 char lastDigit = numstr.charAt(numstr.length()-1);
		 
		 switch (lastDigit) {
		 
		 	case '0':
		 	case '2':
		 	case '4':
		 	case '6':
		 	case '8':
		 		return true;
		 	default:
		 		return false;
		 }
	
			
	 }
	 public static boolean divby6(int userNum) {
		 
		return divby2(userNum) && divby3(userNum);
		
		 
	 }
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int userNum = 600;
			
			System.out.println(divby3(userNum));
			System.out.println();
			System.out.println(divby2(userNum));
			System.out.println();
			System.out.println(divby6(userNum));
			//System.out.println(divby2(userNum));
			
		}	
	
	}
