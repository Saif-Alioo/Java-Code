package Algorithum;

public class binarySearch {
	public static int binarySearchs(int []arr,int x) {
		int e=arr.length-1;
		int s=0;
		while(s<=e) {
		int mid=s+(e-s)/2;
		if(arr[mid]==x) {
			return mid;
		}else
		if(arr[mid]>x) {
			e=mid-1;
		}else 
			s=mid+1;
		}
		return -1;
	}
	
public static void main(String[] args) {
	int []arr=new int[] {1,2,4,5,6};
	int index=binarySearchs(arr, 4);
	if(index!=-1) {
	System.out.println("Index of number is "+index);
	}else {
		System.out.println("Key not found:");
	}
}
}
