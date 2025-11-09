package org.ycpait.wrapper;

public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=90;
		//primitive to wrapper
		//Integer iobj=new Integer(i); //integer here is deprecated, means removed or older verision...
		Integer iObj = i; //besides above line use this kind of code
		//this is known as auto-boxing. 
		//process of converting from primitive to wrapper type.
		
		//wraper to primitive
		int j=iObj.intValue();
		i = iObj; //auto-unboxing: wrapper->primitive
		
		
		//String to Wrapper
		Integer o =Integer.valueOf("77");
		//Wrapper to String 
		String str=o.toString();
		
		
		
		//String to Primitive
		int p=Integer.parseInt("87");
		//Primitive to String
		String data=Integer.toString(p);
		
		
		
		

	}

}