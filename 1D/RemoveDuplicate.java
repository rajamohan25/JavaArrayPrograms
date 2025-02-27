// Sample output
// Enter size of the array: 7
// Enter 1th element: 8
// Enter 2th element: 6
// Enter 3th element: 8
// Enter 4th element: 4
// Enter 5th element: 2
// Enter 6th element: 6
// Enter 7th element: 1
// Array: [8, 6, 8, 4, 2, 6, 1]
// Result array: [8, 6, 4, 2, 1]

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+(i+1)+"th element: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array: "+Arrays.toString(arr));
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[j]!=Integer.MIN_VALUE) {
					count++;
					arr[j]=Integer.MIN_VALUE;
				}
			}
		}
		int[] res = new int[size-count];
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i]!=Integer.MIN_VALUE) {
				res[j]=arr[i];
				j++;
			}
		}
		System.out.println("Result array: "+Arrays.toString(res));
	}
}
