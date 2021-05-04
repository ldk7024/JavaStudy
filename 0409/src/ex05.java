
public class ex05 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 24;
		int result = LargeNumbers(num1, num2);
		System.out.println("큰 수 확인:" + result);

	}

	public static int LargeNumbers(int num1, int num2) {
		int result = 0;
		if (num1 > num2) {
			result = num1;
		} else if (num1 < num2) {
			result = num2;

		} else {
			result = 0;
		}
		return result;
	}
}
