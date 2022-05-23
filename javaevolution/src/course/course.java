package course;

import java.util.Scanner;
public class course {

	int courseId = 10;
	String courseName = "Math";
	int courseFee = 9;
	
	void displayCourseDetails()
	{
		
//		course d1 = new course();
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	
	
	static void authenticate(String username, String password)
	{
		course d1 = new course();
		
		
		if(username.equals("Admin") && password.equals("1234"))
		{
		    d1.displayCourseDetails();
		}
		else 
		{
			System.out.println("Invalid Username or password");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
		
//		course d1 = new course();
//		d1.displayCourseDetails();
		System.out.println("Inter Your Usernam");
		String user = scanner.next();
		System.out.println("Inter Your Password");
		String pass = scanner.next();
		
		authenticate(user,pass);
		authenticate("ram","5454");
	}

}
