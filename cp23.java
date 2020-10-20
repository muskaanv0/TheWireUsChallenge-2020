import java.util.*;
import java.io.*;
class cp23{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        String a=scn.nextLine();   
        String b=scn.nextLine();
        System.out.println(firstOccur(a,b));
    }
    
    public static int firstOccur(String a, String b){
        for(int i=0 ; i+b.length()<=a.length() ; i++){
            String s=a.substring(i,i+b.length());
            if(s.equals(b)==true){
                return i;
            }
        }
        return -1;
    }

}
