package student;

public class Person {
	// �Ӽ�����
	private String name;
	private String job;
	private int age;
	
	// ������: �̸�, ����, ���̸� ��� �ʱ�ȭ
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
