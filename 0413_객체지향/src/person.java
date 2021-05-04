
public class person {  //vo (value object)클래스

	private String name;
	private int age;
	
	
	
	public person(String name, int age) {
		super();
		// 가장 먼저 객체 생성시 실행되어야 하는 기능을 작성
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
    public int getAge() {
		return age;
	}
	

	
}
