package student ;

public class Student extends Person {
	
// 속성정의
	
/*private String name;
private String job ="학생";
private int age;*/
	public Student(String name,  int age) {
		// super(); // 슈퍼클래스의 기본생성자 호출
		super(name, "학생", age);
		}
  public void study() {
	System.out.println("공부하기");
}





}
