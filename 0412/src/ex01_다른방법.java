
public class ex01_다른방법 {

	public static void main(String[] args) {
		int [] array = {1,3,4,8,7,9,10};
		arrayTostring(array);
	}
   // static: 정적 메소드, static이 없으면 오류남
	public static void arrayTostring(int[] array) {
	   for (int num : array ) {
		   System.out.print(num+ "  ");

	}
   }
}


