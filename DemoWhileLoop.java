class DemoWhileLoop{

public static void main(String[] args){
	int a;
	a=97;
	int i = 2;

	boolean isPrime = true;

	//while loop used
	while(i<a){
		if(a % i == 0)
		{
			isPrime = false;
			break;
		}
		i++;
	}
	//condition
	if(isPrime)
		System.out.println("PRIME");

	else
		System.out.println("NOT PRIME");
}
}