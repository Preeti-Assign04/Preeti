package sep22.day6.Assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
	
		int[] a = {2, 4, 12, 3, 40};
		Arrays.sort(a);
		
		for (int i=0; i<a.length; i++)
		{
			Arrays.sort(a);
			System.out.println(a[i]);
		}
			 System.out.println("The second largest element from the end is:" + a[(a.length)-2]);
		 
		
	}

}
