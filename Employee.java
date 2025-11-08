
public class Employee {
	private static int count;
	private int id;
	private String name;
	private double basicSalary;
	
	public Employee( String name, double basicSalary) {
		count++;
		this.basicSalary=basicSalary;
		this.id = count;
		this.name = name;
	}
	
	void showDetails() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.basicSalary);
	}
	
	public double calculateSalary() {
		return basicSalary;
	}
	
}
