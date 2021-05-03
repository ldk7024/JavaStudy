
public class EX04opr {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 7;
		
		float num3 = 10.0f;
		float num4 = 7.0f;
		
		System.out.println(num1/num2);
		System.out.println(num3/num4);
		System.out.println(num1/num4);
		//자동 형 변환: 데이터 타입의 크기가 작은 변수가 크기가 큰 변수 데이터 타입으로 변환됨 
        
	  String a = 10 + 7 +"";
	  String b = 8+ "" + 2;
	  String c = "" +5+2;
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  
	  System.out.println((float)num1/(float)num2);
	  // 강제 형 변환: 데이터 타입을 강제로 변경
	  
	 
	}

}
