package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("The deposited amount -10000");

	}
	public static void main(String[] args) {
		AxisBank AB= new AxisBank();
		AB.saving();
		AB.fixed();
		AB.deposit();
	}

}
