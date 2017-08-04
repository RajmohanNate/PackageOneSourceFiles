package packageOne;

public class EmpObject {

	public static void main(String[] args) {
		
		// create object to accesss the class from main method
		
		
		
		Employee /* Name of the class*/ e1 /*ref name */= new /* name of the object whcih should be the same as class*/ Employee();
		
		e1.Name="Sam";
		e1.Id=123;
		e1.Salary=40000;
		e1.doInduction();
		e1.paySalary();
		System.out.println();
		
// you can create n number of objects for the same class passing different values
Employee /* Name of the class*/ e2 /*ref name */= new /* name of the object whcih should be the same as class*/ Employee();
		
		e2.Name="Trump";
		e2.Id=100;
		e2.Salary=1000000;
		e2.doInduction();
		e2.paySalary();
		System.out.println();
		
		
		// you can create n number of objects for the same class passing different values
		Employee /* Name of the class*/ e3 /*ref name */= new /* name of the object whcih should be the same as class*/ Employee();
				
				System.out.println("E3 result");
				e3.doInduction();
				e3.paySalary();
				System.out.println();
	}

}
