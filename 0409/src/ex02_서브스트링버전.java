import java.util.Scanner;

public class ex02_���꽺Ʈ������ {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.print("���þ� >> ");
	      String num = sc.next();
	      
	      
	     while(true) {       
	        System.out.print("�Է� �ܾ �Է��� �ּ���>> ");
	        String num2 = sc.next(); 
	        
	        if(!num.substring(num.length()-1).equals(num2.substring(0,1)) ) { 
	           
	           System.out.println("Ʋ�Ƚ��ϴ�.");
	           break;
	        }
	        num = num2;
	     }
	     

	}

}
