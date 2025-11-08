package studentmanagementpp;

public class StudentManagementApplication {

	public static void main(String[] args) { //main is also an static member , so jvm can call it 
		
		System.out.println("Number of Students registered are " + Student.getCount()
		);
		//how to creat object of student:
		//1. create a reference of Student type
		Student s; //reference created here.it is stored in stack
//		Scanner sc = new Scanner(System.in);
//		int choice =-1;
		
		System.out.println("Before"); //constructor is called here.
//		System.out.println(s); //ERROR. bec we dont assign any value
		
		//2. create object and assign to reference variable
		s = new Student(1,98.99f,"Rushabh"); //create a object by using new and assign it to s.
		System.out.println(s); //constructor called after object is created
//		System.out.println(s); //it will run bec we assign value here.
		
/*		System.out.println(s.rollNumber);
//		System.out.println(s.marks);
		System.out.println(s.name);
*/		
		//assigning new values here
//		s.rollNumber=1; // we make rollNumber private so it cannot be accessible.
//		s.rollNumber=-1; //to stop this we make sure rollNumber 
						//is not accessible outside the class
						//in which it is declared
//		s.name = "Amit";
//		s.marks = 99.98f;
//		s.accept(1, "Amit", 99.98f); //weassign some values so we no need to give values here, bec of constructor. here we call it explicitly
//		s.display(); //invoking display() method
		
		s.display("*"); //it will created table like this
		
//		Student s1 = new Student(2, 77.7f, "Ajay"); //parameterized constructor called here.
//		s1.display();
		
		//created another Student object and assign some values: it is used to when we created different of same class
		Student ss;
		ss = new Student(1,89.8f,"Amit"); //when parameterized constructor creaated this will be called
		System.out.println(ss);
		ss.accept(2, "Anuj", 78.87f); //when parameterized constructor not created we use this, assign value
		ss.display();
		
/*		@Override
		//overriden method
		//this method should return string whic is  useful information about this object
		///
		public String toString() {
		    System.out.println("in toString");
			return this.rollNumber + " " + this.name + " " + this.marks;
		}
*/
	}

}
