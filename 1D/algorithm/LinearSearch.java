// Linear search : It is a simple searching algorithm that finds an element in a list by checking each element one by one from the 
// beginning to the end until the desired element is found or the list is fully traversed.

// Sample output
// Enter size of the array: 12
// Enter 1th element: 5
// Enter 2th element: 8
// Enter 3th element: 3
// Enter 4th element: 4
// Enter 5th element: 6
// Enter 6th element: 9
// Enter 7th element: 16
// Enter 8th element: 15
// Enter 9th element: 18
// Enter 10th element: 2
// Enter 11th element: 0
// Enter 12th element: 4
// ***********************
// Enter key element: 18
// [5, 8, 3, 4, 6, 9, 16, 15, 18, 2, 0, 4]
// Key element is present at 8th index

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+(i+1)+"th element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("***********************");
		System.out.print("Enter key element: ");
		int key = sc.nextInt();
		String res = "not present";
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				res = "present";
				index = i;
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		if(index != -1)
			System.out.println("Key element is "+res+" at "+index+"th index");
		else
			System.out.println("Key element is "+res+" "+index);
	}
}
