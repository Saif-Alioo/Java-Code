package Recursion;

import java.lang.Math;
public class geometricSum {
	public static double GSum(int n) {
		if(n==0) {
			return 1;
		}
		
		double smallAns=GSum(n-1);
		
		
		return smallAns+1.0/(Math.pow(2,n));
	}
public static void main(String[] args) {
	double sum=GSum(3);
	System.out.println(sum);
}
}
