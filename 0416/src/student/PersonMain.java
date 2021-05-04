package student;

public class PersonMain {

	public static void main(String[] args) {
	// Student 객체 생성
	Student student = new Student("이대교", 26);
	// Teacher 객체 생성
     Teacher teacher = new Teacher("김성은", 27,1000000000);
	
	//배열생성 (길이 2)
	Person [] arr =new Person[2];
	// student 객체와 teacher 객체 자동형변환 -> person(업캐스팅)
	arr[0] =  student;
	arr[1] = teacher;
	
	for(Person p:arr) {
		System.out.println("이름: "+p.getName());
		System.out.println("직업: "+p.getJob());
		System.out.println("나이: "+p.getAge());
	}
	// 다운캐스팅: 원래 객체의 메소드, 필드에 접근하기 위해 강제 형변환
	// student의 study() 호출
	Student student2 = (Student)arr[0];
	student2.study();
	
	// teacher의 연봉출력
	       Teacher teacher2  = (Teacher)arr[1];
	       teacher2.getPay();
	       teacher2.teach();
	
	
	
	}

}
