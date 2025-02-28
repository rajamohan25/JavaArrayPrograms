// Binary Search - It is an efficient searching algorithm that works on sorted arrays. It follows the divide and conquer approach,
// reducing the search space by half at each step.

// Step 1 : Array should be sorted
// Step 2 : Mark i) lower index ii) mid index iii) higher index
// Step 3 : Do this 3 task
//          i) is the key element present in middle,
//          ii) is the key element present in left half,
//          iii) is the key element present in right half
// Repeat the process until the element is found or the search space becomes empty.

// Sample output
// Enter size of the array: 13
// Enter 1th element: 2
// Enter 2th element: 4
// Enter 3th element: 12
// Enter 4th element: 14
// Enter 5th element: 15
// Enter 6th element: 21
// Enter 7th element: 30
// Enter 8th element: 34
// Enter 9th element: 38
// Enter 10th element: 41
// Enter 11th element: 48
// Enter 12th element: 80
// Enter 13th element: 82
// ***********************
// Enter key element: 82
// [2, 4, 12, 14, 15, 21, 30, 34, 38, 41, 48, 80, 82]
// Key element is present at index 12

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+(i+1)+"th element: ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // will be sorted if not in sorted order
		System.out.println("***********************");
		System.out.print("Enter key element: ");
		int key = sc.nextInt();
		String res = "not present";
		int index = -1;
		int l = 0;
		int h = arr.length-1;
		while (l<=h) {
			int mid = (l+h)/2;
			if(key==arr[mid]) {
				res = "present";
				index = mid;
				break;
			} else if (key<arr[mid]) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		if(index!=-1) {
            System.out.println("Key element is "+res+" at index "+index);
        } else {
            System.out.println("Key element is "+res+" in the array "+index);
        }
	}
}
