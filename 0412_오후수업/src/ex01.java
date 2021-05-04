import java.util.Arrays;

public class ex01 {

	public static void main(String[] args) {
   int [] array = {1,2,3,4,5};
   array=sort_method(array);
   System.out.println(Arrays.toString(array));
   

	   
   }
	public static int[] sort_method(int[]arr) {
		for(int k = 0; k<arr.length-1; k++) {
	         for(int i = 0; i<arr.length-1-k; i++) {
	            if(arr[i]<arr[i+1]) {
	               int temp = arr[i];
	               arr[i] = arr[i+1];
	               arr[i+1] = temp;
	            }
	         }
	      }
		return arr;
	}
}
