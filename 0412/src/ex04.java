import java.util.Random;

public class ex04 {
	public static void main(String[] args) {
		// 매개변수로 넘겨받은 크기의 배열을 생성하고 랜덤으로 값을 초기화하고 랜덤값 범위 1~5
		// 데이터 중복 없어한다.
		// 랜덤 값으로 초기화된 배열 반환
  
	int [] array = createrandomnumber(6);
    arrayTostring(array);
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
	   for (int num : array ) {
		   System.out.print(num+ "  ");
   
}
   }
}
