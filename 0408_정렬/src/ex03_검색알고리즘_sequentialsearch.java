import java.util.Arrays;

public class ex03_�˻��˰���_sequentialsearch {

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
	    System.out.println(arr[j]+"��"+" " +j+"��° �����Դϴ�.");
	    
	
	  }
	// ��Ҹ� j�� ���������ϱ� �װɷ� ���

}


