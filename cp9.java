import java.io.*;
import java.util.*;
class cp9{
    public static Scanner scn=new Scanner(System.in);

    public static void display(int[] arr){
        System.out.println("After reversing: ");
        for(int i=0 ;i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr){
        int i=0 , j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        display(arr);
    }

    public static void main(String[] args){
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0 ;i<arr.length ;i++){
            arr[i]=scn.nextInt();
        }
        reverse(arr);
    }
}
