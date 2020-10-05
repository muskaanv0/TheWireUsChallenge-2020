import java.io.*;
import java.util.*;
class cp17{
public static Scanner scn=new Scanner(System.in);

public static void sortedSub(String str, String ans){
    if(str.length() ==0)
    return;

    char ch=str.charAt(0);  //b
    String roq=str.substring(1);  //c
    // String ans="";
    System.out.print(ans + ch + " ");  
    sortedSub(roq, ans+ ch);
}

public static void main(String[] args){
    //ENTER THE INPUT STRING
    String str=scn.nextLine();

     // TO SORT THE INPUT STRING
     // convert input string to char array 
     char tempArray[] = str.toCharArray();   
     // sort tempArray 
     Arrays.sort(tempArray); 
     // store new sorted string 
     String s= new String(tempArray); 

    for(int i=0 ; i<s.length() -1 ; i++){
    char ch=s.charAt(i);
     System.out.print(ch + " ");
     sortedSub(s.substring(i+1) , ch+"" );   
    }
    System.out.print(s.charAt(s.length()-1));
}

}
