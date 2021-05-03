
public class ex04comparison {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 10;
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
	
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		//문자비교는 equals 써야함
		System.out.println(str1.equals(str2));
	}

}
