// Sample Output
// Enter size of the array: 5
// Enter 0 index value :2
// Enter 1 index value :3
// Enter 2 index value :8
// Enter 3 index value :4
// Enter 4 index value :6
// Original array: [2, 3, 8, 4, 6]
// Reversed array: [6, 4, 8, 3, 2]

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+i+" index value :");
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array: "+Arrays.toString(arr));
		int[] rev = new int[size];
		for(int i=0,j=size-1;i<rev.length;i++,j--) {
			rev[i]=arr[j];
		}
		System.out.println("Reversed array: "+Arrays.toString(rev));
	}
}
