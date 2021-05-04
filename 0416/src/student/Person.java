package student;

public class Person {
	// 속성정의
	private String name;
	private String job;
	private int age;
	
	// 생성자: 이름, 직업, 나이를 모두 초기화
	public Person(String name, String job, int age) {
		
		this.name = name;
		this.job = job;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public int getAge() {
		return age;
	}
	
	
}
