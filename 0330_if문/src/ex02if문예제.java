import java.util.Scanner;

public class ex02if������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		if (age>=20) {System.out.println("�����Դϴ�.");}
		else {System.out.println("�̼������Դϴ�.");}*/
		
		//age�� 20�� �̻��̸� "�����Դϴ�."���
		//���ϸ� "�̼������Դϴ�."���
		System.out.println("���� �Է�: ");
		int num= sc.nextInt();
		if (num%3==0 && num%5==0) {System.out.println("3�� 5�� ����Դϴ�.");}
		else {System.out.println("3�� 5�� ����� �ƴմϴ�.");}
		

	}

}
