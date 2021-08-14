package debuggingQue;

public class multiplyNumber {
public static void main(String[] args) {
	int n1=11,n2=12,n3=13,multi;
	
	int max=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
//	System.out.println(max);
	int min=(n1<n2)?((n1<n3)?n1:n3):((n2<n3)?n2:n3);
//	System.out.println(min);
	int mid=(n1+n2+n3)-(max+min);
	multi=max*mid;
	System.out.println(multi);
}
}
