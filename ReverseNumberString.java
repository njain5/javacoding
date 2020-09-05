package javacodes;

public class ReverseNumberString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num = "120845";
		int num2 = Integer.parseInt(num);
		int reversed = 0;
		
		while(num2 != 0) {
			int digit = num2%10;
			reversed = reversed * 10 + digit;
			num2 = num2/10;
		}
		
		System.out.println("Reversed Number: " + reversed);

	}

}
