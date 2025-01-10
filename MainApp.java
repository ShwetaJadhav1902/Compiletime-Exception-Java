package compiletimeexception;
import java.util.Scanner;
public class MainApp {
	public static void main(String[] args) throws EmailException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Email== ");
		String Email=sc.next();
		
		if(Email.contains("@")&&(Email.contains(".com")))
		{
			System.out.println("valid Email");
		}
		else {
			throw new EmailException("Invalid Email");
		}
		
	}
}
