import java.io.*;
import java.util.*;
class cp13{
public static Scanner scn=new Scanner(System.in);
public static void toh(int n, String s, String h, String d){
    if (n==0)
    return ;

    toh(n-1,s,d,h);
    System.out.println("move "+n+"  th from "+s+" to "+d);
    toh(n-1,h,s,d);
}

public static void main(String [] args){
int n=scn.nextInt();
toh(n,"A","B","C");
}

}
