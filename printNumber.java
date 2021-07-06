package Recursion;

public class printNumber {
	static void printNum(int n) {
		//Base case
		if(n==0) {
			return;
		}
		//Recursion
		printNum(n-1);
		System.out.print(n+" ");  //1 2 3 4 5 
	}
	
	
	static void printNum2(int n) {
		//Base case
		if(n==0) {
			return;
		}
		//Recursion
		System.out.print(n+" ");
		printNum2(n-1);          // 5 4 3 2 1 
		
	}
public static void main(String[] args) {
	printNum(5);
	System.out.println(" ");
	printNum2(5);
}
}
