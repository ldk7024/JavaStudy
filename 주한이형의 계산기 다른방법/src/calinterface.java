import java.util.Scanner;

public class calinterface {

	public static void main(String[] args) {
	    calculater cal = new calculater();
	    int num1 = 0;
		int num2 = 0;
		String op = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 주한이형과 함께하는 계산기 프로젝트 =========");
		System.out.println();
		while (true) {
		    System.out.println();
            System.out.print("첫 번째 수를 입력해주세요 형님: ");
            num1 = sc.nextInt();
 
            if (num1 == 0) {
                System.out.print("=============주한이형과 함께하는 계산기 프로젝트 끄읏!!=================");
                return;
            } else {
 
                System.out.print("두 번째 수를 입력해주세요 형님: ");
                num2 = sc.nextInt();
 
                System.out.print("계산할 연산자를 입력해주세요 형님(+ - * /):");
                op = sc.next();
 
                switch (op) {
                case "+":
    				System.out.print("정답 : " + num1 + " + " + num2 + " = " + cal.add(num1, num2));
    				break;
    			case "-":
    				System.out.print("정답 : " + num1 + " - " + num2 + " = " + cal.min(num1, num2));
    				break;
    			case "*":
    				System.out.print("정답 : " + num1 + " * " + num2 + " = " + cal.mul(num1, num2));
    				break;
    			case "/":
    				System.out.print("정답 : " + num1 + " / " + num2 + " = " + cal.div(num1, num2));
    				break;
                default:
                    System.out.println("잘못된 연산자입니다. 다시 입력해주세요 형님");
                }
            }

		}
		
		
		
		

	}

}
