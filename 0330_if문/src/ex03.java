import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("db: ");
		int num1 = sc.nextInt();
		System.out.print("���ڰ��� ����: ");
		int num2 = sc.nextInt();
		System.out.print("os: ");
		int num3 = sc.nextInt();
		System.out.print("���������: ");
		int num4 = sc.nextInt();
		System.out.print("����Ʈ�������: ");
		int num5 = sc.nextInt();
		int sum= num1+num2+num3+num4+num5;
		if (num1 <8 || num2<8 || num3<8 || num4<8 || num5<8 ){
			System.out.println("���հ��Դϴ�. ");
		}else if (sum<=60){
			System.out.println("���հ��Դϴ�. ");
		}else{
			System.out.println("�հ��Դϴ�. ");
			}
		
		
		
}

}
