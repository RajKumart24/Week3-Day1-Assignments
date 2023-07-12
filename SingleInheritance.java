package week3.assignments;


class Computer
{
	public void computerModel()
	{
		System.out.println("Computer Model");
	}
}
class Desktop extends Computer
{
	public void desktopSize()
	{
		System.out.println("Desktop Size");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop dk = new Desktop();
		dk.computerModel();
		dk.desktopSize();

	}

}

