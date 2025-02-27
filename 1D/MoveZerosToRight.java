// Sample output
// Enter size of the array: 8
// Enter 1th element: 2
// Enter 2th element: 0
// Enter 3th element: 0
// Enter 4th element: 4
// Enter 5th element: 0
// Enter 6th element: 0
// Enter 7th element: 8
// Enter 8th element: 1
// Array: [2, 0, 0, 4, 0, 0, 8, 1]
// Result array: [2, 4, 8, 1, 0, 0, 0, 0]

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToRight {

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
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		System.out.println("Result array: "+Arrays.toString(arr));
	}
}
