import java.util.Scanner;

public class ex04���ѹݺ�������Ǯ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int all = 0;
		
		while(true) {
			System.out.println("���� �Է�: ");
			Scanner sc = new Scanner(System.in);
			if(num<0 || num>100) {
				break;
				} 
			      sum+=num;
				  all++;

	


			}
		System.out.println("�հ�: " + sum);
		System.out.println("���:" + (float) sum / all);

	}

}
