import java.util.*;
import java.io.*;
class cp14{

    public static void printEle(Stack<Integer> st){
        
        if(st.size() ==0)
        return;
        
        System.out.println(st.peek());
        st.pop();
        printEle(st);  
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();    
        System.out.println("Enter size of the stack:");
        int n=scn.nextInt();
        System.out.println("Enter numbers:");
        for(int i=1; i<=n ;i++){
           int x=scn.nextInt();    
           st.push(x);
        }  
        System.out.println("Output:");
        printEle(st);  
    }
}
