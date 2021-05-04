import java.util.Scanner;

public class ex03_레퍼런수변수예제 {

	public static void main(String[] args) {  Scanner sc = new Scanner(System.in);
    int[] result = {1,4,3,2,1};
    int[] input = new int[5];
    System.out.println("==채점하기==");
    System.out.println("답을 입력하세요.");
    for(int i = 0; i<input.length; i++) {
       System.out.print(i+1+"번답 >> ");   
       input[i] = sc.nextInt();
    }
    
    System.out.print("입력한 답은 : ");
    for(int i = 0; i<input.length; i++) {
       System.out.print(input[i]+" ");
    }
    System.out.println("\n정답확인");
    int total = 0;
    for(int i = 0; i<input.length; i++) {
       if(input[i]==result[i]) {
          System.out.print("O ");
          total+=20;
       }else {
          System.out.print("X ");
       }
    }
    System.out.println("총점 : "+total);

	
	}

}

