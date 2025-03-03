// Sample output
// Enter the size of the array: 7
// Enter 1th element: 1
// Enter 2th element: 2
// Enter 3th element: 3
// Enter 4th element: 2
// Enter 5th element: 4
// Enter 6th element: 3
// Enter 7th element: 2
// Array: [1, 2, 3, 2, 4, 3, 2]
// Duplicate elements : 2 3 

import java.util.Arrays;
import java.util.Scanner;

public class PrintDuplicates {

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
    System.out.print("Duplicate elements : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[j]!=Integer.MIN_VALUE) {
					System.out.print(arr[j]+" ");
					arr[j] = Integer.MIN_VALUE;
					for(int k=j+1;k<arr.length;k++) {
						if(arr[i]==arr[k]) {
							arr[k]=Integer.MIN_VALUE;
						}
					}
				}
			}
		}
	}
}
