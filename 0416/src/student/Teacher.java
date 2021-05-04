package student ;

public class Teacher extends Person{
private int pay;

public int getPay() {
	return pay;
}

public void teach(){
System.out.println("가르치기");	
}
public Teacher(String name, int age, int pay) {
	super(name, "선생님", age);
	this.pay = pay;
}

}
