import java.util.Random;

public class ex04 {
	public static void main(String[] args) {
		// �Ű������� �Ѱܹ��� ũ���� �迭�� �����ϰ� �������� ���� �ʱ�ȭ�ϰ� ������ ���� 1~5
		// ������ �ߺ� �����Ѵ�.
		// ���� ������ �ʱ�ȭ�� �迭 ��ȯ
  
	int [] array = createrandomnumber(6);
    arrayTostring(array);
	}
   public static int[] createrandomnumber(int array) {
	   // 1. �迭����
	   int[]a = new int[array];
	   // 2. �迭 ��ü(����) ����
	   Random rd = new Random();
	   for (int i=0; i<a.length; i++) {
		   a[i] = rd.nextInt(10)+1;
		   for(int j =1 ;j<=i;j++) {
			   if(a[i]==a[j-1]) {
				   i--;
				   break;
			   }
		   }
		   
	   }
	  return a; 
   }
   public static void arrayTostring(int[] array) {
	   for (int num : array ) {
		   System.out.print(num+ "  ");
   
}
   }
}
