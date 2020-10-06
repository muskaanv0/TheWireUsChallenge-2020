import java.io.*;
import java.util.*;
class cp19{
    public static Scanner scn=new Scanner(System.in);

    public static char compare(char a,char b){       
        return (a==b) ? '0' : '1';
    }

    public static String binaryToGray(String s){
        String gray=" "; 
        gray += s.charAt(0);
        for(int i=1; i<s.length() ; i++){
           char ch=compare(s.charAt(i-1), s.charAt(i));
           gray += ch;
        }
        return gray;
    }

    public static void main(String[] args){
        //input binary of a decimal number:
        String s=scn.nextLine();
        System.out.println("Output: " + binaryToGray(s));
    }
}

