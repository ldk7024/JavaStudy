
public class ex06_foreach������ {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 4, 3, 2, 1, 9, 8, 6, 1, 0, 15 };
		System.out.print("array�� ����ִ� Ȧ����");
		for (int num : arr) {
			if (num % 2 == 1) {
				System.out.print(num + " ");
				sum += 1;

			}
		}

		System.out.println("�̸�, ��" + sum + "�� �Դϴ�.");

	}

}
