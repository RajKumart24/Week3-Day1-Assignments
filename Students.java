package week3.assignments;

public class Students {

	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student ID " +id);
		System.out.println("Student Name " +name);
	}
	public void getStudentInfo(String email, String phone)
	{
		System.out.println("Student email " +email);
		System.out.println("Student phone " +phone);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st = new Students();
		st.getStudentInfo(1582, "Surya");
		st.getStudentInfo("surya@gmail.com", "7485963214");
	}

}
