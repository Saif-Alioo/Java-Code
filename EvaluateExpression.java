
package evaluateexpression;

import java.util.Stack;




public class EvaluateExpression {

    static int EvaluateExression(String[] arr){
        Stack<Integer> st=new Stack<>();
        int result=0;
        for (String arr1 : arr) {
            if ("+".equals(arr1) || "-".equals(arr1) || "*".equals(arr1) || "/".equals(arr1)) {
                int a=st.pop();
                int b=st.pop();
                if (null != arr1) switch (arr1) {
                    case "+":
                        result=b+a;
                        st.push(result);
                        break;
                    case "-":
                        result =b-a;
                        st.push(result);
                        break;
                    case "*":
                        result=a*b;
                        st.push(result);
                        break;
                    case "/":
                        result=b/a;
                        st.push(result);
                        break;
                    default:
                        break;
                }
            } else if (arr1.equals("+") == false && arr1.equals("-") == false && arr1.equals("*") == false && arr1.equals("/") == false) {
                int num = Integer.parseInt(arr1);
                st.push(num);
            }
        }
        
        return st.peek();
    }
    
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the expression in Potfix:");
       String a[];
        a = new String[]{"4","13","5","/","+"};
       
         System.out.println(EvaluateExression(a));
        
        
    }
    
}
