package packageOne;

public class Arrays {

	public static void main(String[] args) {
		
		//Arrays
		// Test Jenkins integration
		
		String shoppingList[] = new String[5];
		shoppingList[0] = "Chocolates";
		shoppingList[1] = "Coke";
		shoppingList[2] = "Chips";
		shoppingList[3] = "Beer";
		shoppingList[4] = "Gin";
		
		System.out.println(shoppingList.length);
		//System.out.println(Arrays.deeptoString(shoppingList));
		
		
		for (int i=0;i<shoppingList.length; i++) {
		
		System.out.println(shoppingList[i]);
		
	}

	}
}

