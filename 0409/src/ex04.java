
public class ex04 {
	public static void main(String[] args) {
		
	
    int result = addNumber(10,15);
    System.out.println(result);
	// 메소드: 객체의 행위를 표현하기 위한 것
    // 반복적으로 사용되는 코드를 줄이기 위해서 씀
	// 어떤 작업을 수행하기 위한 명령문의 집합
	// 메소드 기본 구조 
		/*public int addNumber (int num1, int num2) {
			int result = num1 +num2;
				return result;
		}*/
	//public: 접근 제한자 -> 메소드를 호출해서 쓸 수 있는 범위를 불러서 쓸 수 있음 (범위결정)
	//int: 리턴 타입 -> 명확하게 명시를 해줘야한다.
	// 리턴값이 없을 때는 void를 써야한다.
	// 매개변수: 특정 부분에서만 사용 가능한 변수, 실제로 담기는 값, 받을 데이터의 수
	// 리턴타입: 메소드의 수행결과를 어떤 타입(자료형)으로 반환할 것인지 알려주는 것
	// 메인method가 포함된 class안에서 새로운 method를 만들고자 할때는
	// static 키워드를 붙여준다.
	   
	
	
	}

	public static int addNumber(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}

