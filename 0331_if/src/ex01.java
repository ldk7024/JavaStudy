import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int totalscore = sc.nextInt();
		//IF��: ���������� ������ ���ϸ鼭 �ڵ尡 ����
		//IF���� ���� ���� �������� ���� ���������� �ڵ尡 �����
		if (totalscore>=90) {System.out.println("A�����Դϴ�.");}
		else if (totalscore>=80 && totalscore<=89) {System.out.println("B�����Դϴ�.");}
		else if (totalscore>=70 && totalscore<=79) {System.out.println("C�����Դϴ�.");}
		else {System.out.println("D�����Դϴ�.");}
		
	}

}
