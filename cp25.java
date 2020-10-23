import java.util.*;
import java.io.*;
class cp25{

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());   //test cases
        while(t-- != 0){      
           String s=br.readLine();               //input string
           removeDup(s);
        }
    }

    public static void removeDup(String s){
        boolean[] arr=new boolean[26];   // initially all false in boolean array
        StringBuilder sb=new StringBuilder();

        for(int i=0 ; i<s.length() ; i++){
            if(arr[s.charAt(i)-'a'] == false){
                sb.append(s.charAt(i));
                arr[s.charAt(i)-'a'] = true;
            }
        }
        
        System.out.println(sb);
    }
}
