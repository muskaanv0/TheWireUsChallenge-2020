import java.io.*;
import java.util.*;
class cp8{
    public static Scanner scn=new Scanner(System.in);

    public static void compare(String[] string , String[] query){
        for(int i=0 ; i<query.length ; i++){
            int c=0;
            String a=query[i];
           for(int j=0 ; j<string.length ;j++){               
               String b=string[j];
               boolean ans=a.equals(b);

               if(ans)
               c++;
              
           }
           System.out.println(c);
        }
    }

    public static void main(String[] args){
        int s=Integer.parseInt(scn.nextLine());  //enter number of inputs 
        String[] string = new String [s];        //enter collection of input strings
        for (int i = 0; i < string.length; i++){  
        string[i] = scn.nextLine();  
        }  

        int q=Integer.parseInt(scn.nextLine());  //enter number of queries
        String[] query = new String [q];         //enter collection of query strings
        for (int i = 0; i < query.length; i++){  
        query[i] = scn.nextLine();  
        } 

        System.out.println("Output: ");
        compare(string , query);     
    }
}
