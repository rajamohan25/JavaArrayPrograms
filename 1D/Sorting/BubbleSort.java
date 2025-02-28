// Bubble Sort - It is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if the left 
// element is greater than the right one. This process continues until the array is sorted.

// Sample output
// Enter the size of the array: 8
// Enter 1th element: 9
// Enter 2th element: 5
// Enter 3th element: 4
// Enter 4th element: 13
// Enter 5th element: 1
// Enter 6th element: 27
// Enter 7th element: 7
// Enter 8th element: 10
// Before sorting: [9, 5, 4, 13, 1, 27, 7, 10]
// After sorting: [1, 4, 5, 7, 9, 10, 13, 27]

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+(i+1)+"th element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Before sorting: "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After sorting: "+Arrays.toString(arr));
	}
}
