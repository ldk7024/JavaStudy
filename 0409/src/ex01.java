import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		String data ="������ �� ���̳���?";
		// ���ڿ�. indexOf("����") -> �Ű������� ���� ������ ��ġ ����   // Ư�� ������ ��ġ�� �˰� ������
		System.out.println("==indexOf");
		System.out.println(data.indexOf('?'));
		System.out.println(data.indexOf("��"));
		System.out.println(data.indexOf("��",5));
		System.out.println();
		// ���ڿ�.contains("����") -> �Ű������� ���� ���ڿ��� ���ԵǾ��ִ��� �Ǻ�
/*		  System.out.println("==contains==");
          System.out.println(data.contains("?")); 
          System.out.println(data.contains("!"));
          System.out.println();
          System.out.println("==�ǽ�����==");
          String phone = "010-3369-6611";
          Scanner sc = new Scanner(System.in);
          System.out.print("�˻��� ���� �Է�: ");
          String search = sc.next();
          if (phone.contains(search)) {
        	  System.out.println(search +"�� ���ԵǾ��ֽ��ϴ�.");}
          else { System.out.println(search + "�� ���ڿ��� ���ԵǾ����� �ʽ��ϴ�.");
        	  
          }	  */
		// ���ڿ�. subsring(strart �ε���, end �ε���)
		// �Ű� ������ ���� ��ġ���� ���ڿ��� �߶� �����ϴ� �޼ҵ�, ���̽��� �����̰̽� ����ϴ�.
        System.out.println("==substring==");
	    System.out.println(data.substring(4));
	    System.out.println(data.substring(1, 7));
	    System.out.println();
	    //���ڿ�. charAt(�ε���) -> ���ڿ����� �Ű������� ���� �ε�����° ���ڸ� ��ȯ
	    System.out.println("==charAt==");
	    char s = data.charAt(0);
	    System.out.println(s);
	    System.out.println(data.charAt(data.length()-1));

	
	
	
	
	
	}
          
	

}
