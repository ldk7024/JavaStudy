import java.util.Scanner;

public class ex03_���۷����������� {

	public static void main(String[] args) {  Scanner sc = new Scanner(System.in);
    int[] result = {1,4,3,2,1};
    int[] input = new int[5];
    System.out.println("==ä���ϱ�==");
    System.out.println("���� �Է��ϼ���.");
    for(int i = 0; i<input.length; i++) {
       System.out.print(i+1+"���� >> ");   
       input[i] = sc.nextInt();
    }
    
    System.out.print("�Է��� ���� : ");
    for(int i = 0; i<input.length; i++) {
       System.out.print(input[i]+" ");
    }
    System.out.println("\n����Ȯ��");
    int total = 0;
    for(int i = 0; i<input.length; i++) {
       if(input[i]==result[i]) {
          System.out.print("O ");
          total+=20;
       }else {
          System.out.print("X ");
       }
    }
    System.out.println("���� : "+total);

	
	}

}

