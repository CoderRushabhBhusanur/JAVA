class DemoSelectionConstructs{
	public static void main(String[] args){
		int x;
		x = 1;
		x = 2;
		x = 3;
		//Lenghty condition:
		if(x==1){
			System.out.println("X is One");
		}
		else if(x==2){
			System.out.println("X is Two");
		}
		else if (x==3){
			System.out.println("X is Three");
		}
		else{
			System.out.println("INCORRECT");
		}

		//switch case:
		switch(x){
		case 1: 
			System.out.println("ONE");
			break; //syntactically it is not mandatory to write break. if there is not break then it will go for second condition
		case 2: 
			System.out.println("TWO");
			break;
		case 3: 
			System.out.println("THREE");
			break;
		default: 
			System.out.println("INCORRECT");
			break;
		}
	}
}
