import java.util.Scanner;

public class ex02_����Ͻ� {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	      while (true) {
	         System.out.print("���þ� : ");
	         String startText = sc.next();

	         while (true) {
	            System.out.print("�ܾ �Է��� �ּ��� >> ");
	            String endText = sc.next();
//	            char lastChar = startText.charAt(startText.length()-1);
//	            char firstChar = endText.charAt(0);
	            String lastStr = startText.substring(startText.length() - 1);
	            String firstStr = endText.substring(0, 1);

	            if (!lastStr.equals(firstStr)) {
	               System.out.println("Ʋ�Ƚ��ϴ�.");
	               break;
	            }

	            startText = endText;
	         }
	         System.out.print("����Ͻ�? >> ");
	         String choice = sc.next();
	         if (choice.equals("N") || choice.equals("n")) {
	        	 System.out.println("����!!!");
	            break;
	         
	         }
	      }
 
	}

}
