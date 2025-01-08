package Lecture1;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 101, 12, 30, 40, 15 };
		int data = 120;
		Search(arr, data);
	}

	private static void Search(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				System.out.println("true");
				return;
			}
		}
		System.out.println(false);

	}
}
