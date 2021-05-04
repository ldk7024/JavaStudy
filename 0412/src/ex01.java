
public class ex01 {

	public static void main(String[] args) {
		int [] array = {1,3,4,8,7,9,10};
		arrayTostring(array);
	}
   public static void arrayTostring(int[] array) {
	   for (int i =0; i<array.length ;i++ ) {
		   System.out.print(array[i]+ "  ");
	   }
   }
}
