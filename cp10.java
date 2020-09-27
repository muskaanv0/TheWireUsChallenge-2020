import java.io.*;
import java.util.*;
class cp10{
    public static Scanner scn=new Scanner(System.in);

    public static void display(int[] arr){
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int si, int ei){
        while(si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    
    public static void rotate(int[] arr, int r){
        reverse(arr, 0, r-1);
        reverse(arr, r , arr.length-1);
        reverse(arr, 0, arr.length-1);        
        display(arr);
    }

    public static void main(String[] args){
        int n=scn.nextInt();
        int r=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length ;i++){
            arr[i]=scn.nextInt();
        }
        rotate(arr, r);
    }
}
