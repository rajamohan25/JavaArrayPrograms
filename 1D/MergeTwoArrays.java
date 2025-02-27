// Sample output
// Enter size of array 1: 4
// Enter 0 index value of array 1: 5
// Enter 1 index value of array 1: 31
// Enter 2 index value of array 1: 45
// Enter 3 index value of array 1: 11
// Enter size of array 2: 5
// Enter 0 index value of array 2: 6
// Enter 1 index value of array 2: 35
// Enter 2 index value of array 2: 42
// Enter 3 index value of array 2: 17
// Enter 4 index value of array 2: 24
// Array 1: [5, 31, 45, 11]
// Array 2: [6, 35, 42, 17, 24]
// Result array: [5, 31, 45, 11, 6, 35, 42, 17, 24]

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array 1: ");
		int s1 = sc.nextInt();
		int[] a = new int[s1];
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter "+i+" index value of array 1: ");
			a[i]=sc.nextInt();
		}
		System.out.print("Enter size of array 2: ");
		int s2 = sc.nextInt();
		int[] b = new int[s2];
		for(int i=0;i<b.length;i++) {
			System.out.print("Enter "+i+" index value of array 2: ");
			b[i]=sc.nextInt();
		}
		int[] res = new int[s1+s2];
		for(int i=0,j=0,k=0;i<res.length;i++) {
			if(j<a.length) {
				res[i]=a[j];
				j++;
			} else {
				res[i]=b[k];
				k++;
			}
		}
		System.out.println("Array 1: "+Arrays.toString(a));
		System.out.println("Array 2: "+Arrays.toString(b));
		System.out.println("Result array: "+Arrays.toString(res));
	}
}
