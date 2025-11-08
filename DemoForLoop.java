class DemoForLoop{
public static void main(String[] args){

		int a = 1;
		//basic for loop used:

		for(int i =1; i<=10; i++){//declare i inside for loop
			System.out.println(i*a);
		}
		System.out.println(); //for next line 


		//nested for loop used here:
		for(int i =1; i<=10; i++){//declare i inside for loop
			for(int j=1; j<=10; j++){
			System.out.println(i*j);
		}
		System.out.println(); //for next line 
	}
	}
}