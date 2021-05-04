
public class ex06_foreach문예제 {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 4, 3, 2, 1, 9, 8, 6, 1, 0, 15 };
		System.out.print("array에 들어있는 홀수는");
		for (int num : arr) {
			if (num % 2 == 1) {
				System.out.print(num + " ");
				sum += 1;

			}
		}

		System.out.println("이며, 총" + sum + "개 입니다.");

	}

}
