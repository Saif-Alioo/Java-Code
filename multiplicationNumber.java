package Recursion;

public class multiplicationNumber {
	
	public static int multiplicationNum(int m,int n) {
		if(n==0) {
			return 0;
		}
		int smallMulti=multiplicationNum(m, n-1);
		
		return smallMulti+m;
	}
	
public static void main(String[] args) {
	int sum=multiplicationNum(5, 3);
	System.out.println(sum);
}
}
