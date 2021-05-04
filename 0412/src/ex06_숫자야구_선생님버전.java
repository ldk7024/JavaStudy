import java.util.Random;
import java.util.Scanner;

public class ex06_���ھ߱�_�����Թ��� {

	public static void main(String[] args) {
	      Random rd = new Random();
	      Scanner sc = new Scanner(System.in);
	      
	      //1. ���� ������ �ִ� �迭(����)
	      int[] randomArray = createRandomNumber(3);
	      //2. ����ڰ� �Է��� ���� ������ �ִ� �迭(�Է�)
	      int[] inputArray = new int[3];
	      //3. strike, ball ���� ������ �ִ� �迭
	      int[] sb = new int[2];
	      
	      System.out.println("==GAME START==");
	      arrayToString(randomArray);
	      System.out.println();
	      while(sb[0]!=3) {
	         for(int i=0;i<inputArray.length;i++) {
	            System.out.println(i+1+"��° ���� �Է� : ");
	            inputArray[i] = sc.nextInt();
	         }
	         sb = strikeBallCounting(randomArray, inputArray);
	         System.out.println("strike : "+sb[0]+" ball : "+sb[1]);
	      }
	   }
	   
	   public static int[] strikeBallCounting(int[] array1, int[] array2) {
	      int[] sb = new int[2];    // 0 0 
	      
	      for(int i=0;i<array1.length;i++) {
	         for(int j=0;j<array2.length;j++) {
	            if(array1[i]==array2[j]) {
	               if(i==j) {
	                  sb[0]++;
	               }else {
	                  sb[1]++;
	               }
	            }
	         }
	      }
	      return sb;
	   }
	   public static void arrayToString(int[] array) {
	      for(int num :array) {
	         System.out.print(num+" ");
	      }
	   }
	   
	   public static int[] createRandomNumber(int num) {
	      //1. �迭 ����
	      int[] array = new int[num];
	      //2. ���� ��ü(����) ����
	      Random rd = new Random();
	      do {
	         for(int i=0; i<array.length; i++) {
	            array[i] = rd.nextInt(5)+1;
	         }
	      }while(isDuplicate(array));
	      return array;
	   }
	   
	   public static boolean isDuplicate(int[] array) {
	      boolean result = false;
	      for(int i=0;i<array.length-1;i++) {
	         for(int j=i+1;j<array.length;j++) {
	            if(array[i]==array[j]) {
	               result = true;
	               break;
	            }
	         }
	         if(result == true) {
	            break;
	         }
	      }
	      return result;
	   }


	

}
