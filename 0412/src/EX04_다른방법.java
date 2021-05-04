import java.util.Random;

public class EX04_促弗规过 {

	public static void main(String[] args) {

		int[] array = createrandomnumber(6);
		a(array);
	}

	public static int[] createrandomnumber(int array) {
		// 1. 硅凯积己
		int[] a = new int[array];
		// 2. 硅凯 按眉(档备) 积己
		Random rd = new Random();
		do {
			for (int i = 0; i < a.length; i++) {
				a[i] = rd.nextInt(5) + 1;
			}
		} while (isDupicate(a));
		return a;
	}

	public static boolean isDupicate(int[] array) {
		boolean result = false;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] == array[j]) {
					result = true;
					break;
				}
		}
	}

	public static void arrayTostring(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}
}
