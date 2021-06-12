/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge_sort;

import java.util.Scanner;

/**
 *
 * @author mdsai
 */
public class Merge_sort {

    void printArray(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.println("The element of array is::"+arr[i]);
         }
    }
    void mergeSort(int arr[],int low,int mid,int high){
        int i,j,k;
        i=low;
        j=mid+1;
        k=high;
        int b[]=new int[100];
        while(i<=mid && i<=high){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                k++;
                i++;
            }else{
                b[k]=arr[j];
                k++;
                j++;
            }
            while(i<=mid){
                b[k]=arr[i];
                i++;
                k++;                     
            }
            while(j<=high){
                b[k]=arr[j];
                j++;
                k++;
            }
        }
        for(i=low;i<high;i++){
            arr[i]=b[j];
        }
        
    }
    
    void merge(int arr[],int low,int high){
        int mid;
        if(low<high){
            mid=(low+high)/2;
            merge(arr,low,mid);
            merge(arr,mid+1,high);
            mergeSort(arr,low,mid,high);
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
        Merge_sort ms=new Merge_sort();
        System.out.println("Unsorted Array::");
        ms.printArray(arr, n);
       ms.merge(arr, 0, n);  
       System.out.println("Sorted Array::");
       ms.printArray(arr, n);
       
    }
    
}
