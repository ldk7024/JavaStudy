
public class ex05_레퍼런스변수_실습예제 {

	public static void main(String[] args) {
		int[] array = { 2, 7, 0, 3, 8, 9, 15, 72, 4, 2 };
		// arr에 들어 있는 값 중 가장 큰 값 찾기
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];

			}
		}
		System.out.println("가장 큰 수는:" + max + "입니다.");

		System.out.println();

		// 가장 작은 값 찾기
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}

		}

		System.out.println("가장 작은 값은" + min + "입니다.");

	}

}
