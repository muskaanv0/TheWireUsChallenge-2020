import java.io.*;
import java.util.*;
class cp15{

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        System.out.println(stringToInt(str, str.length()-1));
    }

    public static int stringToInt(String str, int i){
        if(i==-1)
        return 0;

        int sum= stringToInt(str, i-1);

        char ch=str.charAt(i);
        int a=Integer.parseInt(String.valueOf(ch));

        if(i==str.length()-1)
        return sum+a;
        
        else
        return (sum+a)*10 ;
    }
}
