import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		
		Map<Integer , String>cities;  //<key,value>
		cities = new HashMap<Integer,String>(); //Map is interface so we cannot create object of Map so we create object of HashMap
		cities.put(22,"Mumbai");
		cities.put(11, "Delhi"); //key is 22and value is Delhi
		cities.put(33, "Kolkata");
		
		System.out.println(cities); //get output as key=value, eg:22=Mumbai
		
		System.out.println(cities.size()); //return size of array
		
		System.out.println(cities.get(22)); // passing key return value.
		
//		System.out.println(cities.get("Mumbai")); //output is null bec we cannot pass value
		
		System.out.println(cities.containsKey(11)); //return boolean value, if present it is true, else false
		
		System.out.println(cities.containsValue("Mumbai")); //returns boolean value
		
		//deplicate key not allowed
		cities.put(11,"Banglore"); //override the past value
		System.out.println(cities); //replace delhi by banglore
		
		//duplicate value is allowed
		cities.put(20, "Mumbai"); //create new key and assign it value of mumbai
		System.out.println(cities);
		
		cities.remove(33); //remove particular key,value pair by passing key in it
		System.out.println(cities);
		
	}

}

/*{33=Kolkata, 22=Mumbai, 11=Delhi}
3
Mumbai
true
true
{33=Kolkata, 22=Mumbai, 11=Banglore}
{33=Kolkata, 20=Mumbai, 22=Mumbai, 11=Banglore}
{20=Mumbai, 22=Mumbai, 11=Banglore}*/
