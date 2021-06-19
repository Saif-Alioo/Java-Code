
package anagram;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {

    public static boolean isAnagram(String a,String b){
        char []ac=a.toCharArray();
        char []bc=b.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        String ac1=String.valueOf(ac);
        String bc1=String.valueOf(bc);
        return ac1.equals(bc1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string::");
        String s1=sc.nextLine();
        System.out.println("Enter the second string");
        String s2=sc.nextLine();
        
        System.out.println(isAnagram(s1, s2));
    }
    
}
