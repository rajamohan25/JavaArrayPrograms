// Sample Output
// Enter size of the array: 8
// Enter 0 index value: 2
// Enter 1 index value: 3
// Enter 2 index value: 8
// Enter 3 index value: 5
// Enter 4 index value: 2
// Enter 5 index value: 8
// Enter 6 index value: 7
// Enter 7 index value: 1
// Original array: [2, 3, 8, 5, 2, 8, 7, 1]
// Result array: [2, 0, 8, 0, 2, 8, 0, 0]

import java.util.Arrays;
import java.util.Scanner;

public class ChangeOddValuesToZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+i+" index value: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array: "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				arr[i]=0;
			}
		}
		System.out.println("Result array: "+Arrays.toString(arr));
	}
}
