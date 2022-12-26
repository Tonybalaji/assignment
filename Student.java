package Inhiteance;

public class Student 
{
public void getStudentdentinfo(int id)
{
	System.out.println(id);
}

public void  getStudentdentinfo(int id , String name)
{
	System.out.println(id + name);
}

public void  getStudentdentinfo(String email , long phoneNumber)
{
	System.out.println(email + phoneNumber);
}
	public static void main(String[] args) 
	{
	
		Student stu =new Student();
		
		stu.getStudentdentinfo(1008);
		stu.getStudentdentinfo(1008, "Tony");
		stu.getStudentdentinfo("pbalaji240422@gmail.com",    1234598765l);
		
	}
	
}
