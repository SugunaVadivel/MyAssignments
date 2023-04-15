package week3.day1;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID is "+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student id and name is "+id+","+name);
		
	}
	public void getStudentInfo(String email, long phoneNo)
	{
		System.out.println("Student email id is: "+email);
		System.out.println("Student phone numberis : "+phoneNo);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(200);
		obj.getStudentInfo(200, "Suguna");
		obj.getStudentInfo("suguna@gmail.com", 8564321789l);

	}

}
