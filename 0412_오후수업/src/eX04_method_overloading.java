
public class eX04_method_overloading {

	public static void main(String[] args) {
		// 두 개의 정수를 입력받아 두 수의 합을 리턴하는 addinteger()메소드 만들기
        System.out.println(add(10,20));
        // 두 개의 실수를 입력받아 두 수의 합을 리턴하는 adddouble()메소드 만들기
	    System.out.println();
	    System.out.println(add(10.3,20.9));
	    // 한 개의 정수, 한개의 실수를 입력받아 두 수의 합을 리턴하는 addintanddouble()메소드 만들기
	    System.out.println(add(10.3, 10));
	    // 세 개의 정수를 입력받아 합을 출력하는 add3integers()메소드 만들기
	    System.out.println(add(1,2,3));
	    
	    // 메소드 오버로딩이란 메소드의 이름은 하나만 주고 매개변수를 다르게 함으로써 메소드를 여러 개 만드는 기법
	    // 메소드 오버로딩의 조건: 메소드 이름이 같아야함, 매개변수 개수 또는 타입이 달라야함, 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 아님
	    
	    
	} 
	public static int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
   public static int add(int n1, int n2) {
	   return n1+n2;
   }
   public static double add (double n1, double n2) {
	   return n1+n2;
   }
   public static double add(double n1, int n2) {
	   return n1+n2;
   }
}
