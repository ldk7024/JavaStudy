import java.util.Scanner;

public class ex07�ñް��� {

	public static void main(String[] args) {
		//�ñް���
		Scanner sc = new Scanner(System.in);
		System.out.print("�뵿�ð��� �Է��ϼ���: ");
		int workhour = sc.nextInt();
		int basicpay = 5000;
		int pay = workhour > 8 ? 40000 + (basicpay / 2 * 3*(workhour - 8)) : basicpay*workhour;
		System.out.print("�� �ӱ���" + pay +"�� �Դϴ�."); 
	}

}
