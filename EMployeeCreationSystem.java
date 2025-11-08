import java.util.Scanner;

public class EMployeeCreationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//built-in class used to aceept I/P from user.
		Scanner sc = new Scanner(System.in);
	
		int choice  = -1;
		Employee s = null;
		do {
			System.out.println("Welcome to Employee management App");
			System.out.println("====================================");
			System.out.println("1.Register new Employee");
			System.out.println("2.Display Details");
			System.out.println("-1. EXIT");
			choice = sc.nextInt();
		switch(choice) {
		case 1:
			s = new Employee("ANUJ", 2983928);
			break;
			
		case 2:
			if(s!=null) {
				s.showDetails();
			}
			break;
			
		case -1:
			System.out.println("THANK YOU FOR VISITING!!!!");
			break;
		}
	} while(choice !=-1);
	}
}



