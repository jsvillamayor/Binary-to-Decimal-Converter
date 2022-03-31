import java.util.*;
public class Main {

	public static int b2dConvert(int binary) {
		
		String number = String.valueOf(binary);
		int sum = 0;
		
		for(int i=0;i<number.length();i++) {
			
			if(number.charAt(number.length()-1-i)=='1')
				sum = (int) (sum + Math.pow(2, i));
			
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the binary number you want to convert: ");
		int binary = scanner.nextInt();
		
		System.out.println(binary+" in decimal is "+ b2dConvert(binary));

	}

}
