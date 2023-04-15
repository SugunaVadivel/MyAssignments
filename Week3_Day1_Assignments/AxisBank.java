package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Welcome to Axis bank, Deposit your amount");
	}

	public static void main(String[] args) {
		AxisBank service = new AxisBank();
		service.saving();
		service.fixed();
		service.deposit();

	}

}
