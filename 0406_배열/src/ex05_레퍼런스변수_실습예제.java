
public class ex05_���۷�������_�ǽ����� {

	public static void main(String[] args) {
		int[] array = { 2, 7, 0, 3, 8, 9, 15, 72, 4, 2 };
		// arr�� ��� �ִ� �� �� ���� ū �� ã��
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];

			}
		}
		System.out.println("���� ū ����:" + max + "�Դϴ�.");

		System.out.println();

		// ���� ���� �� ã��
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}

		}

		System.out.println("���� ���� ����" + min + "�Դϴ�.");

	}

}
