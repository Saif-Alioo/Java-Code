
package longestcommonprefix;


public class LongestCommonPrefix {

    static String longestCommonPrifixs(String []st){
        if(st.length==0)
            return " ";
        String p=st[0];
        int i=0;
        for( i=1 ; i<st.length; i++){
        while(st[i].indexOf(p)!=0){
            p=p.substring(0,p.length()-1);
            if(p.isEmpty())
                return " ";
        }
    }  
        return p;
    }
    public static void main(String[] args) {
        
        String[] strAr1=new String[] {"Anilo", "Anil", "Anmar"};
        System.out.println(longestCommonPrifixs(strAr1));
    }
    
}   <h1>Output::</h1>An
