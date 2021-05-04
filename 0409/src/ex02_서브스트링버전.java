import java.util.Scanner;

public class ex02_서브스트링버전 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.print("제시어 >> ");
	      String num = sc.next();
	      
	      
	     while(true) {       
	        System.out.print("입력 단어를 입력해 주세요>> ");
	        String num2 = sc.next(); 
	        
	        if(!num.substring(num.length()-1).equals(num2.substring(0,1)) ) { 
	           
	           System.out.println("틀렸습니다.");
	           break;
	        }
	        num = num2;
	     }
	     

	}

}
