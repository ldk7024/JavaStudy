import java.util.Scanner;

public class ex03switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		/*switch(num) { case 1: System.out.println("�Է��� ���� ���� 1�Դϴ�.");
		break;
		case 2: System.out.println("�Է��� ���� ���� 2�Դϴ�.");
		break;
		default:
			System.out.println("�Է��� ���� 1,2�� �ƴմϴ�.");
			break;
		}*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		String opr = sc.next();
		System.out.println("A���� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		System.out.println("B���� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		if (opr.equals("+")) {System.out.print(num1+"��"+num2+"�� ����"+ (num1+num2)+ "�Դϴ�.");}
		else if (opr.equals("-")) {System.out.print(num1+"��"+num2+"�� ����"+ (num1-num2)+ "�Դϴ�.");}
		else if (opr.equals("*")) {System.out.print(num1+"��"+num2+"�� ���� "+ (num1*num2)+ "�Դϴ�.");}
		else {System.out.print(num1+"��"+num2+"�� �������"+ (num1/num2)+"�Դϴ�.");}
	
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
