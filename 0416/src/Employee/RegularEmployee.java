package Employee;

public class RegularEmployee extends Employee {
	   private String empno;
	   private String name;
	   private int pay;
	   private int bonus;
	   
	   
	   
	   public RegularEmployee(String empno, String name, int pay, int bonus) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}

	@Override
	   public int getMoneypay() {
	     
	      return (pay+bonus)/12;
	   }

	   @Override
	   public void print() {
	      System.out.println(empno+":"+name + ":"+ pay);
	      
	   }
	   
	}