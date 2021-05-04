
public class ex03 {

	public static void main(String[] args) {
	     int[] array = { 2, 7, 3, 5, 4 };
//	      int[] array = { 2, 4, 3, 5, 4 };
	      boolean check = isDuplicate(array);
	      System.out.println(check);
	   }

	   public static boolean isDuplicate(int[] array) {
	      for (int i = 0; i < array.length - 1; i++) {
	         for (int j = i + 1; j < array.length; j++) {
	            if (array[i] == array[j]) {
	               return true;
	            }
	            
	         }
	      }return false;


	}
	
		
}
