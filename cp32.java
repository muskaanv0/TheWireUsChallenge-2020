import java.util.*;
public class cp32{
public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the  value of m");
		int m = scn.nextInt();
		System.out.println("Enter the  value of p");
		int p = scn.nextInt();
		System.out.println("Enter the value of w(Average of m+p sets)");
		float w = scn.nextFloat();
		System.out.println("Enter the number of elements in set p");
		int size = scn.nextInt();
		System.out.println("Enter the "+size+" values of set p");
		int pv[] = new int[size];
		int psum = 0;
		for (int i=0;i<size ;i++ ) {
			pv[i] = scn.nextInt();
			psum+=pv[i];
		}
		for (int i=0;i<=9 ;i++ ) {
			psum+=i;
			if (psum==p) {
				System.out.println("The missing number is "+i);
				System.exit(1);
			}
			psum-=i;
		}
		System.out.println("-1");
	}
} 
