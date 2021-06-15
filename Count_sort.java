
package count_sort;

import java.util.Scanner;


public class Count_sort {
    //print array.
   void printArray(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.println("The element of array is::"+arr[i]);
        }
}
    //find max number of array.
   int maximum(int arr[],int n){
       int max=-1;
       for(int i=0;i<n;i++){
           if(max<arr[i])
               max=arr[i];
       }
       return max;
   }
   //Count sort
   void count_Sort(int arr[],int n){
       int i,j;
       int max=maximum(arr, n);
       int arr1[]=new int[max+1];   //Creating a array with size maximumu number...
       for( i=0;i<=max;i++ ){
           arr1[i]=0;
       }
       for(i=0;i<n;i++){
           arr1[arr[i]]=arr1[arr[i]]+1;
       }
       i=0;
       j=0;
       while(i<=max){
           if(arr1[i]>0){
               arr[j]=i;
               arr1[i]=arr1[i]-1;
               j++;
           }else{
               i++;
           }
       }
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        //Array creation 
        int arr[]=new int [100];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        Count_sort cs=new Count_sort();
        System.out.println("Unsorted Array is::");
        cs.printArray(arr, n);
        cs.count_Sort(arr, n);
        System.out.println("Sorted Array ::");
        cs.printArray(arr, n);
        
        
        
    }
    
}
