import java.util.Scanner;
class cp1{
public static Scanner scn=new Scanner(System.in);

public static void solve(int[][] arr){
    
    for(int j=0 ;j<arr[0].length ;j++){

        if(j%2==0){
            for(int i=0 ;i<arr.length ; i++){
                System.out.print(arr[i][j] + ",");
            }            
        }
        else{
            for(int i=arr.length-1 ;i>=0 ; i--){
                System.out.print(arr[i][j] + ",");
            } 
        }

        if(j==arr[0].length-1)
        System.out.print("END");

    }
}


public static void main(String[] args){

    System.out.println("enter number of rows:");
    int r=scn.nextInt();
    System.out.println("enter number of columns:");
    int c=scn.nextInt();
    int[][] arr=new int[r][c];

//input array
System.out.println("input elements:");

    for(int i=0; i<r ; i++){
     for(int j=0; j<c ;j++){
         arr[i][j]=scn.nextInt();
     }
    }
    
    solve(arr);
}
}
