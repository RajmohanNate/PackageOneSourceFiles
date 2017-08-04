package packageOne;

public class Employee {

	public static String Name;
	public static int Salary;
	public int Id;
	
	public void doInduction() {
		System.out.println("Do Emp id is " + Id + " for " +Name);
	}
	
	public void paySalary() {
		System.out.println("Pay salary is "+Salary + " for " +Name);
	}
}

