package Recursion;

public class countNumber {
	public static int Count(int n) {
		//Base case.
		if(n==0) {
			return 0;
		}
		int small=Count(n/10);
		return small+1;
	}
	
public static void main(String[] args) {
	int k=Count(4987);
	System.out.println("Number of Digits are "+k);
}
}
