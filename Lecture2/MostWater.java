package Lecture2;

public class MostWater {
	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		water(arr);
	}

	private static void water(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int w = j - i;
				int h = Math.min(arr[i], arr[j]);
				int water = w * h;
				ans = Math.max(ans, water);
				System.out.print(water+" ");
			}
			System.out.println();
		}
		System.out.println(ans);

	}

}
