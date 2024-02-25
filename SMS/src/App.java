import java.util.*;
public class App {
		
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("1. Show\n2. Add\n3. Delete\n4. Exit");
			int n= sc.nextInt();
			
			switch(n) {
				case(1):
					System.out.println("Display All values");
					break;
				case(2):
					System.out.println("Add Details");
					break;
				case(3):
					System.out.println("Delete values");
					break;
				case(4):
					System.out.println("Exit Successful");
					return;
			}
		}
		

	}

}
