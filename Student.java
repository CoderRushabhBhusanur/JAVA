package studentmanagementpp;

public class Student {
	
		private static int count;
	
	
	
		//attributes:these are properties of each students.OR Instance variable
		private int rollNumber;
		private String name;
		private float marks;
		
		
		//SETTER method
		/*public void setMarks(float marks) {
			this.marks = marks;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void rsetRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}
		
		//getter method
		public float getMarks() {
			return this.marks;
		}
		
		public int getRollNumber() {
			this.rollNumber;
		}
		
		public String getName() {
			this.name;
		}*/
		
		//STANDARD CONVENTION TO WRITE SETTER_GETTER
		
		
		//constructor is created
		//it is no-argument constructor
		/*public Student() {
			System.out.println("=====Inside Student()=====");
			this.rollNumber = 1;
			this.name = "Rushabh";
			this.marks = 99.99f;
		}*/
		
		//parameterized constructor: it should be used 
		public Student(int rollNumber, float marks, String name) {
			System.out.println("=====PARAMETERIZED CONSTRUCTOR====");
			count++; //when we created object constructor called and count get increased.
			this.rollNumber= count;
			this.name = name;
			this.marks = marks;
		}
		
		//we make this static bec we dont want to make any object of getCount, if we create an object then count will not be start from 0
		public static int getCount() {
			return count;
		}
		
		//to make above private accessible we use get set method
		void accept(int rollNumber, String name, float marks) {
			this.marks = marks;
			this.name = name;
			this.rollNumber = rollNumber;
		}
		
		//line 12 to 16 is method defination.
		//here display is instance method
		void display() {
			System.out.println(this.marks); //here we used reference. "this" reference is used. //syso(marks) we can write like this, but for more readable code we mention this..
			System.out.println(this.name);
			System.out.println(this.rollNumber);
		}
		
		
		//method is have same name, but signature is different
		//THis is method overloading
		//overloaded display method:
		void display(String format) {
			
			System.out.println("RollNumber \t Name \t Marks"); //column head looks like this
			for(int i=0;i<40;i++) //loop will play
				System.out.print(format);
			
			//println is parameterized constructor. it is without argument
			System.out.println();//for new line/ system is a class, out is static member of a class.
			
			//println is overloaded argument. it is with argument.
			System.out.println(this.rollNumber+ "\t    " + this.name +"t    " + this.marks); //"\t" it used for tab change
		}

		//right click on screen-> go to souce-> -> then choose option Generate Setter-Getter.
		public int getRollNumber() {
			return rollNumber;
		}

		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getMarks() {
			return marks;
		}

		public void setMarks(float marks) {
			this.marks = marks;
		}

		// here we write private so no one cant access it. and we can write private methods here, private methods are helper method
		//we use this bec it is easy to use count;
		private static void setCount(int count) {
			Student.count = count;
		}
		
		
		

}


