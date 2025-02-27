// Sample output
// Enter size of the array: 6
// Enter 0 index element: 8
// Enter 1 index element: 4
// Enter 2 index element: 3
// Enter 3 index element: 14
// Enter 4 index element: 7
// Enter 5 index element: 2
// Enter nth value: 3
// Array: [8, 4, 3, 14, 7, 2]
// 3th largest element: 7

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+i+" index element: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter nth value: ");
		int n = sc.nextInt();
		if(n>size || n<=0) {
            System.out.println("Invalid input! n should be between 1 and "+size);
            return;
        }
		System.out.println("Array: "+Arrays.toString(arr));
		int nth = Integer.MIN_VALUE;
		for(int k=1;k<=n;k++) {
			int largest = Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>largest) {
					largest = arr[i];
				}
			}
			nth=largest;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==largest) {
					arr[i] = Integer.MIN_VALUE;
					break;
				}
			}
		}
		System.out.println(n+"th largest element: "+nth);
	}
}
