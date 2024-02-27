import java.util.*;
import java.sql.*;
public class App {
		
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","Chinu720@");
		System.out.println(con);
		while(true) {
			
			System.out.println("1. Log In\n2. Sign Up");
			int n= sc.nextInt();
			
			switch (n) {
				case 1:
					System.out.println("Log In");
					break;
				case 2:
					System.out.println("Sign Up");
					break;
			}
				


//			switch(n) {
//				case(1):
//					System.out.println("Display All values");
//					break;
//				case(2):
//					System.out.println("Add Details");
//					break;
//				case(3):
//					System.out.println("Delete values");
//					break;
//				case(4):
//					System.out.println("Exit Successful");
//					return;
//			}
		}
		

	}

}
