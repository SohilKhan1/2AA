package Lecture1;

public class Array_Demo {
	public static void main(String[] args) {
		int[] arr = new int[5];

		System.out.println(arr);

		int arr1[] = { 1, 2, 3, 4, 5 };

		System.out.println(arr1);

		System.out.println(arr1.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}