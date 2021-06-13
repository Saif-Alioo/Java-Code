package insertation_sort;


import java.util.Scanner;

public class Insertation_Sort {

    void printArray(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.println("The element of array is::"+arr[i]);
        }
    }
    void InsertationSort(int arr[],int n){
        int i,j,k;
        for(i=0;i<n;i++){
            k =arr[i];
            for(j=i-1;j>=0 && k<arr[j];j--){
                arr[j+1]=arr[j];
                
            }
            arr[j+1]=k;
        }
    }
    public static void main(String[] args) {
        int arr[]=new int [100];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            Insertation_Sort IS=new Insertation_Sort();
             
            System.out.println("The Unsorted Array is::");
            IS.printArray(arr, n);
            IS.InsertationSort(arr, n);
            System.out.println("The Sorted Array is::");
            IS.printArray(arr, n);   
    }
}
