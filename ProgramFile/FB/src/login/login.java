package login;

public class login 
{
	String uid;
	String pwd;

	login()
	{
	}

	login(String uid, String pwd)
	{
		this.uid=uid;
		this.pwd=pwd;
	}

	public static void fbLogin()
	{
		login ob1= new login("amy","a12");
		System.out.print("Login successfull");
	}

}