package week3.day1.assignments;

public class AxisBank extends Bank{
	public void deposit() {
		System.out.println("overriding method");
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank obj=new AxisBank();
obj.saving();
obj.fixed();
obj.deposit();
	}

}
