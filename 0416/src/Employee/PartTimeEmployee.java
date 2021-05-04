package Employee;

public class PartTimeEmployee extends Employee {
	private String empno;
	private String name;
	private int pay;
	private int workDay;
	
	
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}



	@Override
	public int getMoneypay() {
		// TODO Auto-generated method stub
		return pay*workDay;
	}



	@Override
	public void print() {
		System.out.println(empno+":"+name + ":"+ pay);
		
	}


	
	
	
	

	
	
	
	
	

}
