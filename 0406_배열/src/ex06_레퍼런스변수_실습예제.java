import java.util.Scanner;

public class ex06_���۷�������_�ǽ����� {

	public static void main(String[] args) {
		// 5���� ������ �����͸� ���� �� �ִ� �迭 ����
		int[] scoreArr = new int[5];
		Scanner SC = new Scanner(System.in);
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(i + 1 + "��° �Է� >>");
			scoreArr[i] = SC.nextInt();
		}
		System.out.print("�Էµ� ����: ");
		for (int j = 0; j < scoreArr.length; j++) {
			System.out.print(scoreArr[j] + " ");
		}
	}

}
