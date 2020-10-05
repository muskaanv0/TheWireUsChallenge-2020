import java.io.*;
import java.util.*;
class cp18{
public static Scanner scn=new Scanner(System.in);

    public static void tri(int[] arr){
        if(arr.length -1 ==0)
        return;

        int[] ans=new int[arr.length-1];
        for(int i=0 ; i<arr.length-1 ;i++)
        ans[i]=arr[i]+arr[i+1];

        tri(ans);
        
        for(int i=0 ;i<ans.length ; i++)
        System.out.print(ans[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0 ;i<arr.length ; i++)
        arr[i]=scn.nextInt();
    
        tri(arr);

        for(int i=0 ;i<arr.length ; i++)
        System.out.print(arr[i] + "  ");
    } 
}
