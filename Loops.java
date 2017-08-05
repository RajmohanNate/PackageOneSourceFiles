package packageOne;

public class Loops {

	public static void main(String[] args) {
		
		
		// While loop		
	/*	int a = 0;
	
		while(a<10) {
			
			System.out.println(a);
			a = a+1;
		}*/		
	
		// For loop		
		/* for (int b=1; b<=10; b=b+2) {
			
				System.out.println("The value of b is "+b);
		
				*/
		
		int a = 0;
		int d = 0;
		while (a<10) {			
			d=d+1;
			a=a+1;
			System.out.println();
			System.out.println("This is "+d+ " times table");
			System.out.println();
			
			
		for (int c=1; c<=10; c++) {
					
					int e=c*d;
					System.out.println(c+" X "+d+" = "+e);
					/* System.out.println("2 X " +c+" = " +2*c);
					
					e=e+1; */
					// Commented to check the branch
					
		}
		}
	}

}
