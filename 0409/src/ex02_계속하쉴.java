import java.util.Scanner;

public class ex02_계속하쉴 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	      while (true) {
	         System.out.print("제시어 : ");
	         String startText = sc.next();

	         while (true) {
	            System.out.print("단어를 입력해 주세요 >> ");
	            String endText = sc.next();
//	            char lastChar = startText.charAt(startText.length()-1);
//	            char firstChar = endText.charAt(0);
	            String lastStr = startText.substring(startText.length() - 1);
	            String firstStr = endText.substring(0, 1);

	            if (!lastStr.equals(firstStr)) {
	               System.out.println("틀렸습니다.");
	               break;
	            }

	            startText = endText;
	         }
	         System.out.print("계속하쉴? >> ");
	         String choice = sc.next();
	         if (choice.equals("N") || choice.equals("n")) {
	        	 System.out.println("종료!!!");
	            break;
	         
	         }
	      }
 
	}

}
