
public class ex03_abs_method {

	public static void main(String[] args) {
		int num = abs_method(-5);
		System.out.println(abs_method(-8));
		System.out.println(Math.abs(-15));

	}
   public static int abs_method (int n) {
	   int result =n;
	   if(n<0) {
		   result = n*-1;
	   }
	   
	   
	   
	   return result;
   }
}
