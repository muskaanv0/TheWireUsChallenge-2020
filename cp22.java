import java.util.*;
import java.io.*;
class cp22{
    public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter sentence: ");
        String s=scn.nextLine();
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
        int count=0;     //length of a word
        for(int i=0 ; i<s.length() ; i++){
            char ch=s.charAt(i);

            if(ch== ' ')
            count=0;

            else
            count++;
        }
        return count;    //returns length of last word
    }

}
