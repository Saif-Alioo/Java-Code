package Recursion;

public class countZeros {
	public static int countZero(int n) {
		//Base casd
		if(n==0) {
			return 0;
		}
		//recursive
		int smallAns=countZero(n/10);
		//calculation
		int last_digit=n%10;
      if(last_digit==0) 
    	  return 1+smallAns;
      else
    	  return smallAns;
	}
	
	
public static void main(String[] args) {
int zero=countZero(1020);
	System.out.println(zero);
	
}
}
