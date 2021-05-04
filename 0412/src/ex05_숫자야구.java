
public class ex05_숫자야구 {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3,4,5};
		int[] array2 = { 1, 3, 2,2,7 };

		int[] sb = strikeballcounting(array1, array2);
		arrayTostring(sb);

	}

	public static int[] strikeballcounting(int[]array1 , int[]array2) {
		int[]a = new int[2];
		for(int i=0 ; i<array1.length ; i++ ) {
			if(array1[i] ==array2[i]) {
				a[0]+=1;
			}
			for (int j=0 ; j<array1.length; j++) {
				if(array1[i]==array2[j] && i!=j)a[1]+=1;
				
			}
		   
			}
		return a;
		}

      public static void arrayTostring(int[] sb) {
		   for (int i =0; i<sb.length ;i++ ) {
			   System.out.print(sb[i]+ "  ");

}
      }
}
