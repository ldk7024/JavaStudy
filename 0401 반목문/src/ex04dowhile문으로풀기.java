import java.util.Scanner;

public class ex04dowhile������Ǯ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;
		int sum = 0;
		int all = 0;
	    do {System.out.println("���ڸ� �Է��ϼ��� ");
		    num = sc.nextInt();
	        sum += num; //sum = sum=num
			all++;}  //all+=1
		
		while(num>=0 && num<=100);
	    System.out.println("�հ�: " + sum);
		System.out.println("���:" + (float) sum / all);

	
	
	
	
	
	
	
	}

}
