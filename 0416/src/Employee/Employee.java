package Employee;

public abstract class Employee {
// 속성정의
private String empno;
private String name;
private int pay;

// 기능정의
// pay를 리턴
// 추상메소드: 정의만 해두고 이 클래스를 상속받아서 작성한 클래스에서 오버라이딩 해줘야함
public abstract int getMoneypay();

//사원번호: 이름:월급 출력
public abstract void print(); 










}
