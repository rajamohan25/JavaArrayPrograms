// Sample output
// Enter size of the array: 6
// Enter 0 index value: 5
// Enter 1 index value: 2
// Enter 2 index value: 3
// Enter 3 index value: 1
// Enter 4 index value: 4
// Enter 5 index value: 2
// Array: [5, 2, 3, 1, 4, 2]
// Sum of array: 17

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+i+" index value: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array: "+Arrays.toString(arr));
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
        System.out.println("Sum of array: "+sum);
	}
}
