import java.util.*;
class cp5{
public static Scanner scn=new Scanner(System.in);

public static void printAns(String str){
  StringBuilder sb=new StringBuilder();
  sb.append(str.charAt(0));
  for(int i=1 ; i<str.length() ;i++){
      if(str.charAt(i-1)== str.charAt(i)){
       sb.append('*');
      }else{
       sb.append(str.charAt(i));
      }
  }
  System.out.println(sb);
}

public static void main(String[] args){
    String str=scn.nextLine();
    printAns(str);  
}
}
