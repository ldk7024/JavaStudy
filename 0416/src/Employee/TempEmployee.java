package Employee;

public class TempEmployee extends Employee{
        private String empno;
        private String name;
        private int pay;  //����
        
	
	
	
	
	
	
	
	
	
	
	
	
	public TempEmployee(String empno, String name, int pay) {
			super();
			this.empno = empno;
			this.name = name;
			this.pay = pay;
		}


	@Override
	public int getMoneypay() {   //���޿�
		// TODO Auto-generated method stub
		return pay/12;
	}

	@Override
	public void print() {
	   System.out.println(empno+":"+name +":"+pay);
		
	}

}
