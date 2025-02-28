// Selection Sort - It sorts an array by consistently selecting the smallest element from the remaining unsorted elements and putting 
// it in its sorted place.

// Sample output
// Enter the size of the array: 7
// Enter 1th element: 5
// Enter 2th element: 2
// Enter 3th element: 1
// Enter 4th element: 68
// Enter 5th element: 13
// Enter 6th element: 6
// Enter 7th element: 1
// Before sorting: [5, 2, 1, 68, 13, 6, 1]
// After sorting: [1, 1, 2, 5, 6, 13, 68]

public class SelectionSort {

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
		int smallest = 0;
		for(int i=0;i<arr.length;i++) {
			smallest  = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		System.out.println("After sorting: "+Arrays.toString(arr));
	}
}
