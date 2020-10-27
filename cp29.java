import java.util.*;
public class cp29{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		long arr[] = new long[size];
		long count = 0;
		for (int i=0;i<size ;i++ ) {
			arr[i] = scn.nextLong();
			count+=arr[i];
		}
		System.out.println(count);
	}
}
