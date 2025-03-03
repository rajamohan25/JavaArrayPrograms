// Sample output
// Enter the size of the array: 7
// Enter 1th element: 15
// Enter 2th element: 30
// Enter 3th element: 45
// Enter 4th element: 30
// Enter 5th element: 60
// Enter 6th element: 45
// Enter 7th element: 30
// Array: [15, 30, 45, 30, 60, 45, 30]
// Element - 15 , Count - 1
// Element - 30 , Count - 3
// Element - 45 , Count - 2
// Element - 60 , Count - 1

import java.util.Arrays;
import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+(i+1)+"th element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array: "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=Integer.MIN_VALUE;
				}
			}
			if(arr[i]!=Integer.MIN_VALUE) {
				System.out.println("Element - "+arr[i]+" , Count - "+count);
			}
		}
	}
}
