import java.util.Arrays;

public class ex03_검색알고리즘_sequentialsearch {

	public static void main(String[] args) {
		int[] arr = { 13, 35, 15, 11, 26, 72, 78, 13, 61, 90 };
		int j = 0;
		int i =0;
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
			if (arr[i] == 78) {
				j = i;
			} 

		}
        
		System.out.println();
	    System.out.println(arr[j]+"은"+" " +j+"번째 숫자입니다.");
	    
	
	  }
	// 장소를 j에 저장했으니까 그걸로 출력

}


