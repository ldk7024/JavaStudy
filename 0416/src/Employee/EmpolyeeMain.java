package Employee;

public class EmpolyeeMain {

	public static void main(String[] args) {
		// 추상클래스는 객체 생성 불가능 -> 상속을 통해서 서브클래스로 객체 생성해야함
		// new Employee();
		
		//regular, parttime, temp 객체생성
		//배열에 넣어주기 (길이 3인 배열)
		//print() 메소드 호출
		
		RegularEmployee r = new RegularEmployee("1", "이대교", 7000, 500); 
		PartTimeEmployee p = new PartTimeEmployee("2", "고승우", 10000, 20);
		TempEmployee t = new TempEmployee("3", "유호건", 6000);
		
		Employee[]arr = new Employee[3]; //감사합니다
		arr[0] = r;
		arr[1] = p;
		arr[2] = t;
		
		for(Employee e: arr) {
			e.print();
		}
		
	}

}
