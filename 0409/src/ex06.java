import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���: ");
		int base = sc.nextInt();
		System.out.print("�������� �Է��ϼ���: ");
		int n = sc.nextInt();
		int result = powerN(base, n);
		System.out.println("���Ȯ��: " +result);

	
	
	
	
	}
 public static int powerN(int base, int n) {
	 int result =1;
	 for (int i=0;i<n; i++) {
		 result=result*base;
	 }
	 return result;
 }
     
  
 }

