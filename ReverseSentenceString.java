package javacodes;

public class ReverseSentenceString {

	public void reversewordInmyString(String str) {
		String[] word = str.split(" ");
		String reverseString = " ";
		
		for(int i=word.length-1; i>=0; i--) {
			reverseString = reverseString + word[i] + " ";
		}
		System.out.println(reverseString);
		
	}
	
	public static void main(String[] args) {
		ReverseSentenceString obj = new ReverseSentenceString();
		obj.reversewordInmyString("My Name Is Nikhil");
	}
}
