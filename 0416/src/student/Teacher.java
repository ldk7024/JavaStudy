package student ;

public class Teacher extends Person{
private int pay;

public int getPay() {
	return pay;
}

public void teach(){
System.out.println("����ġ��");	
}
public Teacher(String name, int age, int pay) {
	super(name, "������", age);
	this.pay = pay;
}

}
