package packageOne;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* testing();
		testing();
		testing(); */
		
		testing();
		System.out.println();
		addition1();
		sum(1,2,100);
		int abc=Multiplication(10,10);
		System.out.println();
		System.out.println("result from the method is "+abc);
		
		
	}
	
	
	
	public static void testing () {
			
		System.out.println("This method was created outside main method and is called in is main method");
	}
	
	// Method to perform addition of 3 integers
	
	public static void addition1() {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum =  a+b+c;
		System.out.println(sum);
	}
	
	
	public static void sum(int a, int b, int c) {
		int sum =a+b+c;
		System.out.println(sum);
	}
	
	
	public static int Multiplication(int a, int b) {
		int result=a*b;
		return result;
	}
}



