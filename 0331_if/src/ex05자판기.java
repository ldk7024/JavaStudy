import java.util.Scanner;

public class ex05���Ǳ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ��Ʈ�� a ��ü����
		// ��Ʈ�� ����Ʈ f ��ü �鿩����
		// ����Ī ����
		boolean sw = true;
		while(sw) {
		System.out.println("�ݾ��� �Է��ϼ���");
		int price = sc.nextInt();
		System.out.println("�޴��� ������: 1�� > �ݶ� (800��) 2�� > ���� (500��) 3��> ��Ÿ�ο��� (1500��) 4�� > ����");
		int menu = sc.nextInt();
		int price_after= 0;
		switch (menu) { case 1: System.out.println("�ݶ� ����");
		                price_after = price - 800; 
	                   	break;
		                case 2: System.out.println("���� ����");
		                price_after = price - 500; 
       	                break;
		                case 3: System.out.println("��Ÿ�� ���� ����");
		                
		                price_after = price - 1500; 
		                break; 
		                default: System.out.println("�ٽ� �������ּ��� ");
		                break; 
		                case 4: System.out.println("���α׷� ���� ");
		                sw= false;
		                }
		               if(price_after<0) {System.out.println("���� �����մϴ�.");}
		               else {
		               System.out.println("�ܵ�: "+(price_after));
		               System.out.println("õ��: "+(price_after/1000));
		               System.out.println("�����: "+(price_after%1000/500));
		               System.out.println("���: "+(price_after%1000%500/100));}
	
		              }
	
	
	
	}

}
