
public class ex04_���۷�������_�ǽ����� {

	public static void main(String[] args) {
		// ������ ������ 10���� ���� �� �ִ� �迭�� ����
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("array�� ����ִ� ¦����");
		// ¦�� �����͸� ���
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("�Դϴ�.");
	// array index out of bounds ������ ������ ����� ����� ������.
	
	System.out.println();
	// Ȧ�� �����͸� ����ϱ�
	int sum1=0;
	System.out.print("array�� ����ִ� Ȧ����");
	for (int i =0 ; i < array.length ; i++) {
		if (array[i]%3==0) {
			System.out.print(array[i] + " " );
			sum1++;
		}
	 }
	System.out.println("�̸�," + sum1 + "�� �Դϴ�.");
	
	
	
	
	
	
	
	}

}
