// CONVERT ROMAN STRING TO AN INTEGER
import java.util.*;
import java.io.*;
class cp21{
    public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter Roman Number:");
        String s=scn.nextLine();
        romanToNum(s);
    }

    public static int conv(char ch){
        String str="IVXLCDM";
        int[] arr=new int[str.length()];
        arr[0]=1;
        arr[1]=5;
        arr[2]=10;
        arr[3]=50;
        arr[4]=100;
        arr[5]=500;
        arr[6]=1000;

        int ans=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
            ans=arr[i];
            break;
            }
        }
        return ans;
    }

    public static void romanToNum(String s){      
        int sum=0;
        for(int i=0; i< s.length() ; i++){
            int v1=conv(s.charAt(i));
            if(s.charAt(i)== 'I'){
                if(i+1<s.length() && s.charAt(i+1)=='V' || i+1<s.length() && s.charAt(i+1)=='X'){                    
                    int v2=conv(s.charAt(i+1));                    
                    int v=v2-v1;
                    sum+=v;
                }
                else{
                    sum+=v1;
                }
            }

            else if(s.charAt(i)== 'X'){
                if(i+1<s.length() && s.charAt(i+1)=='L' || i+1<s.length() && s.charAt(i+1)=='C'){                    
                    int v2=conv(s.charAt(i+1));                    
                    int v=v2-v1;
                    sum+=v;
                }
                else{
                    sum+=v1;
                }
            }

            else  if(s.charAt(i)== 'C'){
                if(i+1<s.length() && s.charAt(i+1)=='D' || i+1<s.length() && s.charAt(i+1)=='M'){                    
                    int v2=conv(s.charAt(i+1));                    
                    int v=v2-v1;
                    sum+=v;
                }
                else{
                    sum+=v1;
                }
            }

            else{                
                sum+=v1;              
            }
        }
        System.out.println(sum);
    }
}
