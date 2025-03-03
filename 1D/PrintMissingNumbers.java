// Sample output
// Enter the size of the array: 5
// Enter 1th element: 1
// Enter 2th element: 3
// Enter 3th element: 6
// Enter 4th element: 12
// Enter 5th element: 15
// Array: [1, 3, 6, 12, 15]
// Missing elements: 2 4 5 7 8 9 10 11 13 14 

import java.util.Arrays;
import java.util.Scanner;

public class PrintMissingNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+(i+1)+"th element: ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.print("Missing elements: ");
		for(int i=0;i<arr.length-1;i++) {
			int dif = arr[i+1]-arr[i];
			if(dif>1) {
				int val = arr[i];
				for(int k=0;k<dif-1;k++) {
					System.out.print(++val+" ");
				}
			}
		}
	}
}
