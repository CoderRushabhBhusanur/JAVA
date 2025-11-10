package org.ycpait.geometryapp;

import org.ycpait.geometryapp.entity.Circle;
import org.ycpait.geometryapp.entity.Shape;


public class GeometryApplication {

	public static void main(String[] args) {

		//object of circle created here
		//Shape s = new Circle(2."red"); //inheritance happen here 
		//s is super class type reference 
		//s is reference of super class and it refer-to subclass
		//lead to dynamic polymorphism...
		//object here is circle.
		
		//System.out.println("Area of a circle is " + s.calculateArea());
		
		//s.draw(); //when we call this it goes to circle draw

		Shape s;
		// s = new shape(); //can't instantiate abstract class     //ERROR
		
		
	    s = new Circle(2,"red");
	    
		//calculateArea is invoke here
		System.out.println("Area of a circle is " + s.calculateArea());
		
		//invoke draw() here:
		s.draw(); //when we call this it goes to circle draw
		//jiska object hota hai usika call hota hai.
		
		//c = (circle) s; //upcasting 
		
		Circle c1 = (Circle) s; //downcasting
		c1.getPi(); //invoking circle specific method............
		
		
		
		//INVOKING GENERELIZED METHOD:
		s.calculateArea();
		s.calculatePerimeter();
		s.draw();
		
		//INVOKING SPECIALISED METHOD:
		Circle c = (Circle) s; //here we do type-casting//also down-casting
		c.getPi();
		
		
		
		
		
		System.out.println();
		 
		/*Rectangle r = new Rectangle(4,5,"Blue");
		System.out.println("Area of a Rectangle is " + r.calculateArea());
		r.draw();*/

	}

}
