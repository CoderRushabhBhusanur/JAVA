   class DemoConditionalConstructs{
   	public static void main(String[] args){
		int age; //variable declaration
		age=20; //assigning value.
		char nationality;
		nationality = 'I';

		if(age>18 && nationality == 'I'){ //use relational operator > and use comparison operator ==.
        		System.out.println("Eligible for voting"); //output priting.
		}
		
		//nested loop used here:
		if(age>18){
			if(nationality == 'I'){
				System.out.println("Eligible for voting");
			}
		}
		else{
			System.out.println("Not Eligible for voting");
		}	
        }
   }