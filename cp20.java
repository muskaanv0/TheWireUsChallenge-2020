import java.io.*;
import java.util.*;
class cp20 {
    public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {		
		int n=scn.nextInt();
		String str1="0";
		String str2="1";
		printNos(n,str1,1);
		printNos(n,str2,1);
	}

	public static void printNos(int n, String str, int idx) {
		if(idx==n){
			int v=Integer.parseInt(str, 2);
			if(v!=0)System.out.println(v);
			return;
        }
        
        char prev=str.charAt(idx-1);
        
        if(prev=='1')
        printNos(n, str+"0", idx+1);

		else{
			printNos(n, str+"0", idx+1);
			printNos(n, str+"1", idx+1);
		}
	}

}
