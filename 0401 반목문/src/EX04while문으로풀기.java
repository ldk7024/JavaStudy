import java.util.Scanner;

public class EX04while������Ǯ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int all = 0;
		while (true) {
			System.out.println("���ڸ� �Է��ϼ��� ");
			int num = sc.nextInt();
			if (num <= 100 && num>=0) {
				sum += num;
				all++;
			} else {
				break;
			}
			

		} 
		System.out.println("�հ�: " + sum);
		System.out.println("���:" + ((float) sum / all));

	}

}
