
public class ex02 {

	public static void main(String[] args) {
	int [] array = {2,4,3,5,4};
	boolean check = isDupicate(array);
	System.out.println(check);

	}
   public static boolean isDupicate(int []array) {
	   boolean result =false;
	   for(int i=0 ; i<array.length-1 ; i ++) {
		   for(int j=i+1; j<array.length ; j++)
		   if(array[i]==array[j]) {
			   result=true;
			   break;
		   }
		  
		   
	   }
	   return false;
   }
}
