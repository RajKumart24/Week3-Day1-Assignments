package week3.assignments;

class BankInfo
{
	public void saving()
	{
		System.out.println("Savings--> from BankInfo");
	}
	public void fixed()
	{
		System.out.println("fixed--> from BankInfo");
	}
	public void deposit()
	{
		System.out.println("deposit--> from BankInfo");
	}
}
public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("deposit--> from AxisBank");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank AB = new AxisBank();
		AB.saving();
		AB.fixed();
		AB.deposit();

	}

}
