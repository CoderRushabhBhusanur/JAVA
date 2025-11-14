import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		
		List<String> cities; //this is how we write generic<Type>
		cities = new ArrayList<String>();
		System.out.println(cities.size());
		cities.add("Mumbai"); //adding element at last
		cities.add("Pune"); //adding pune in array
		cities.add("DELHI"); 
		cities.add("Mumbai");//index allows duplicates

		//it give error bec we make generic in above so it will accept only string not integer
//		cities.add(12);
		//you can convert integer to string like below:
		cities.add(12+""); //collection allowed to add any type of data //BOXING HAPPEN(PRIMITIVE TO WRAPPER)...//this line cause ERROR

		System.out.println("BEFORE" + cities);
		Collections.sort(cities); //sorting is happening here, COllections is a class and sort is a static method, which sort cities alphabetically
		System.out.println("AFTER" + cities);
		
		System.out.println();
		
		System.out.println(cities.size()); //number of elements
		System.out.println(cities); //print cities present upto here
		cities.add(1, "Delhi"); //adding at given index
		System.out.println(cities); //print all cities
		System.out.println(cities.size()); //size(): gives size of array
		System.out.println(cities.get(0)); //list is index based
		System.out.println(cities.get(1)); //it gives bec we replaced pune by delhi in above
		System.out.println(cities.get(2)); //give city name at index 2
		System.out.println();
		
		System.out.println("REMOVE");
		cities.remove(1); //removes particular element from given index
		System.out.println(cities.size()); //after removing gives size of array
		System.out.println(cities); //after removing give remaining cities.
		System.out.println();
		
		System.out.println("CLEAR");
		cities.clear();//it will clear everything
		System.out.println(cities); //give array after removing everything
		System.out.println(cities.size()); //give size after clearing 
	}

}
