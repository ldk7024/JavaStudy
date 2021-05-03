import java.util.Scanner;

public class ex03switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		/*switch(num) { case 1: System.out.println("입력한 값은 숫자 1입니다.");
		break;
		case 2: System.out.println("입력한 값은 숫자 2입니다.");
		break;
		default:
			System.out.println("입력한 값은 1,2가 아닙니다.");
			break;
		}*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연산을 입력하세요: ");
		String opr = sc.next();
		System.out.println("A값을 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println("B값을 입력하세요: ");
		int num2 = sc.nextInt();
		if (opr.equals("+")) {System.out.print(num1+"과"+num2+"의 합은"+ (num1+num2)+ "입니다.");}
		else if (opr.equals("-")) {System.out.print(num1+"과"+num2+"의 차는"+ (num1-num2)+ "입니다.");}
		else if (opr.equals("*")) {System.out.print(num1+"과"+num2+"의 곱은 "+ (num1*num2)+ "입니다.");}
		else {System.out.print(num1+"과"+num2+"의 나누기는"+ (num1/num2)+"입니다.");}
	
	    switch(opr) { case "+": System.out.println(num1+num2);
	                  break;
	    case "-": System.out.println(num1-num2);
        break;
	    case "*": System.out.println(num1*num2);
        break;
	    case "/": System.out.println(num1/num2);
        break;
	    
	    }
	
	
	    
	    
	    
	    
	    }        

	}
