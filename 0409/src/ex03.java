import java.util.Arrays;

public class ex03 {

	public static void main(String[] args) {
		// 문자열 . split (문자열) -> 매개변수로 넣은 문자열을 기준으로 잘라 배열로 반환
		String phone2 = "010-3369-6611";
	    String[] cut = phone2.split("");
		System.out.println(Arrays.toString(cut));
		
        
	}

}
