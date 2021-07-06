package Recursion;

public class sumOfDigits {
	public static int sum(int n) {
		//Base case
		if(n==0) {
			return 0;
		}
		//Recursive part
		int smallAns=sum(n/10);
		int last_digit=n%10;
//		calculation
		return smallAns+last_digit;
	}
	
public static void main(String[] args) {
	int k=sum(1234);
	System.out.println("sumOfDigits "+ k);
}
}
