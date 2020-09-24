import java.util.Scanner;
class cp7{
    public static Scanner scn=new Scanner(System.in);

    public static String compress(String str){
        StringBuilder sb=new StringBuilder();
        int c=1;   //c = count of times an alphabet has appeared 
        for(int i=0 ; i<str.length() - 1  ; i++){
            if(str.charAt(i) != str.charAt(i+1)){
                sb.append(str.charAt(i));

                if(c>1)
                sb.append(c);

                c=1;   //set count to 1 again
            }else{
                c++;
            }
        }
        sb.append(str.charAt(str.length()-1));
        
        if(c>1)
        sb.append(c);
         
        return sb.toString();
    }

    public static void main(String[] args){
    //input string to be compressed
       String str=scn.nextLine();   
       System.out.println(compress(str));
    }
}
