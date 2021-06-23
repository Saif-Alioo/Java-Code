 
package zerosumsubarray;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mdsai
 */
public class ZeroSumSubarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean found =false;
        int []a ={1,3,4,5,6,6};
//        int k=7;
//int count=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum +=a[j];                
                if(sum==12){
                    found =true;
//                    count++;
                   System.out.print("{");
                    for(int k=i;k<=j;k++){
//                     System.out.print( i + " "+ j );
                       System.out.print(a[k]+" ");
                       
                    }
                    System.out.print("}");
                    break;
                }
               
            }
//            if(found) break;
        }
//Set<Integer> set=new HashSet<>();
//int sum=0;
//for(int ele:a){
//    set.add(sum);
//    sum+=ele;
////    System.out.print(sum+" ");
//
//    if(set.contains(sum)){
//        
//        found=true;
//        break; 
//    }
//}
//        System.out.println(count);
        System.out.println("Found "+found);
    }
    
}
