import java.util.*;
class cp3{
    public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("input n:");
        int n=scn.nextInt();
        int[] arr=new int[n];
        System.out.println("input values:");
        for(int i=0 ; i<n ; i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("largest area of rectangle in the given histogram:");
        System.out.println(largestArea(arr));
    }
    
    public static int largestArea(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] nseL=new int[arr.length];
        int[] nseR=new int[arr.length];
        // nseL -> next smallest element to the Left
        // nseR -> next smallest element to the Right

        for(int i=0 ; i<arr.length ; i++){
            while( st.size()>0 && arr[i]<=arr[st.peek()] ){
              st.pop();
            }
            if(st.size()==0)
            nseL[i]= -1;

            else
            nseL[i]= st.peek();

            st.push(i);
        }

        st=new Stack<>();

        for(int i=arr.length-1 ; i>=0 ; i--){
            while( st.size()>0 && arr[i]<=arr[st.peek()] ){
              st.pop();
            }
            if(st.size()==0)
            nseR[i]= -1;

            else
            nseR[i]= st.peek();

            st.push(i);
        }

        //to compute the max area
        int max=0;
        for(int i=0 ; i<arr.length ; i++){
            int h=arr[i];
            int w=nseR[i]-nseL[i]-1;
            int area=h*w;
            if(area>max)
            max=area;
        }
        return max;        
    }
}
