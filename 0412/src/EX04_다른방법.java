import java.util.Random;

public class EX04_�ٸ���� {

	public static void main(String[] args) {

		int[] array = createrandomnumber(6);
		a(array);
	}

	public static int[] createrandomnumber(int array) {
		// 1. �迭����
		int[] a = new int[array];
		// 2. �迭 ��ü(����) ����
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
