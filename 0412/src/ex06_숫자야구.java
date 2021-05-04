import java.util.Random;
import java.util.Scanner;

public class ex06_숫자야구 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		// 1. 답을 가지고 있는 배열생성(랜덤)
		int[] randomarray = createrandomnumber(3);
		int[] inputarray = new int[3];
		int[] sb = new int[2];
        
		System.out.println("==GAME START==");
		arrayTostring(randomarray);
		System.out.println();
		while (sb[0]!=3) {
			
			for (int i = 0; i < inputarray.length; i++) {
				System.out.print(i + 1 + "번째 숫자 입력: ");
				inputarray[i] = sc.nextInt();
				}
			sb = strikeballcounting(randomarray,inputarray );
			System.out.println("strike :" +sb[0]+" ball:"+sb[1]);
			}
		 
		
		}
	

	public static int[] strikeballcounting(int[] array1, int[] array2) {
		int[] a = new int[2];
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[i]) {
				a[0] += 1;
			}
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] == array2[j] && i != j)
					a[1] += 1;

			}

		}
		return a;
	}
	   public static int[] createrandomnumber(int array) {
		   // 1. 배열생성
		   int[]a = new int[array];
		   // 2. 배열 객체(도구) 생성
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
		   for (int i =0; i<array.length ;i++ ) {
			   System.out.print(array[i]+ "  ");
		   }
		   }

	public static boolean isDuplicate(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return true;
				}

			}
		}
		return false;

	}
}

	
