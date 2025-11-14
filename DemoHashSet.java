import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		
		Set<String> cities;
		cities = new HashSet<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");

		System.out.println(cities);
		System.out.println(cities.size());
		cities.add("Mumbai"); //Doesn't allow duplicates
		System.out.println(cities); //so we get only 1 from same values.
		System.out.println(cities.contains("Mumbai")); //BOOLEAN VALUES, if mumbai present returns true else false
		
		//ERROR: NO INDEX METHOD.....
//		System.out.println(cities.get(0)); //Doesn't work bec this key is not present
//		cities.add(1,"Delhi"); //ERROR
		
		cities.clear(); //remove all elements
	}

}
