import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.print("ù ��° ������ �Է��ϼ��� >> ");
			int num1 = sc.nextInt();
			System.out.print("�� ��° ������ �Է��ϼ��� >> ");
			int num2 = sc.nextInt();
			System.out.print("[1]���ϱ� [2]���� >> ");
			int num3 = sc.nextInt();
			if (num3 == 1) {
				System.out.print("���ϱ� ���� �����" + (num1 + num2) + "�Դϴ�.");
			} else if (num3 == 2) {
				System.out.print("���� ���� �����" + (num1 - num2) + "�Դϴ�.");
			}
			System.out.println("�ٽ� �����Ͻðڽ��ϱ�? (Y/N) ");
			choice = sc.next();

		} while (choice.equals("Y"));
		System.out.println("����Ǿ����ϴ�.");

	}

}
