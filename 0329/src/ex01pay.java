import java.util.Scanner;

public class ex01pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("몇 명인가요?");
        int num1 = sc. nextInt();
        System.out.println("총 금액은 얼마인가요?");
        int num2 = sc. nextInt();
        System.out.println("각 자 지불해야할 금액은 :" + (num2/num1));
		
		
	}

}
