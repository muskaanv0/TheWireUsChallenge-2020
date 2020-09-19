import java.util.Scanner;
class cp2{
public static Scanner scn=new Scanner(System.in);

public static void camelCaseDecipher(String str){
    //si-start index, ei-end index

   for(int si=0 ; si<str.length() ; si++){  
       char ch=str.charAt(si);

       if(si<str.length()-1 && ch>='A' && ch<='Z'){   
        int ei=si+1;       
        while(str.charAt(ei)>='a' && str.charAt(ei)<='z'){               
            if(ei==str.length()-1) {  
            ei++;
            break;
           }else{
            ei++;
           }
        }
           System.out.println(str.substring(si,ei));           
       } 
       
       //if last character of the string is in capital
       else if(si==str.length()-1 && ch>='A' && ch<='Z'){
           System.out.println(ch);
       }  
   }
}

public static void main(String[] args){
    System.out.println("enter the string for deciphering: ");
    String str=scn.nextLine();
    System.out.println("After deciphering: ");
    camelCaseDecipher(str);
}

}
