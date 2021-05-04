
public class AddressMain {

	public static void main(String[] args) {
		Address ar = new Address();
		// 속성값 지정
		ar.name = "이대교";
		ar.phonenumber= "010-3369-6611";
        ar.address = "광주";     		
		
		
		
		
		
		
		ar.showAddr();
		
		Address ar2 = new Address();
		ar2.name = "이명진";
		ar2.phonenumber= "010-1111-1111";
        ar2.address = "의왕";  
        ar2.showAddr();
		
        Address ar3 = ar2;
        ar3.name = "강의환";
        System.out.println(ar2.name);

	}

}
