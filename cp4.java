import java.util.*;
class cp4{
    public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args){
       String str=scn.nextLine();
       StringBuilder sb=new StringBuilder();

       for(int i=0 ; i<str.length()-1 ; i++){
        char ch1= str.charAt(i); 
        char ch2= str.charAt(i+1); 
        int diff= ch2-ch1;
         
        sb.append(ch1);
        sb.append(diff);
      }  
      sb.append(str.charAt(str.length()-1));

      System.out.println(sb);
    
    }
}
