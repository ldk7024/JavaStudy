import java.util.Scanner;

public class ex01dowhile�� {

	public static void main(String[] args) {
		//do while�� -> do{���๮��1} while();
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("���������: ");
	    int now = sc.nextInt();
	    System.out.print("��ǥ������: ");
	    int target = sc.nextInt();
	    int week = 1;
		do { 
			System.out.print(week+"���� ���� ������:" );
		    int w = sc.nextInt();
		    now -=w;  //now = now - w
		    week++;
		    
		    
		    
		   
		}while(now>target); System.out.print(now + "kg �޼�!! �����մϴ�!"); 
		

	
	
	
	
	}

}
