import java.util.Scanner;

public class ex02review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("java ���� �Է�:");
		int javascore = sc.nextInt();
		System.out.print("web ���� �Է�:");
		int webscore = sc.nextInt();
		System.out.print("Android ���� �Է�:");
		int androidscore = sc.nextInt();
		
	    System.out.println("�հ�: " + (javascore + webscore + androidscore) );
		System.out.println("���: " +((javascore+webscore+androidscore)/3));

	}

}
