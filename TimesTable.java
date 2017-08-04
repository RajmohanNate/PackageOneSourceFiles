package packageOne;

public class TimesTable {

	public static void main(String[] args) {
			
		int a = 0;
		
		// Total number of times table to be created
		
		while (a<10) {			
		
		// Variable a is incremented outside of for loop as this will control how many times the table is to be created
			a=a+1;
			
			System.out.println();
			System.out.println("This is "+a+ " times table");
			System.out.println();
			
		// 	
		for (int c=1; c<=10; c++) {
					
					int e=c*a;
					System.out.println(c+" X "+a+" = "+e);
										
				
			}
		}

	}

}
