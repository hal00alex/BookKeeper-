import java.util.*; 

public class BookKeeper {
	 
	public static void main(String[] args) {
		//creating an empty array list 
		ArrayList<String> books = new ArrayList<String>();
	 
		//Adding items to arrayList 
		books.add("Caves of Steel"); 
		books.add("The Hobbit");
		books.add("Cracking the Coding Interview");
		
		//Display the contents of the array list 
		System.out.println("Current Books Avaible: "+ books);
		
		//Checking the Index of an Item 
		int pos = books.indexOf("Caves of Steel"); 
		System.out.println("Caves of Steel is in aisle: " + pos);
		
		//Checking if array list is empty: books.isEmpty(); 
		
		//Showing Size of an List
		int numBooks = books.size(); 
		System.out.println("The Book Keeper has " + numBooks + " books"); 
		
		//Checking if an element is included to the list 
		//boolean isIn = books.contains("Algorithm Design");
		
		//Getting the element in a specific position 
		String title = books.get(0); 
		System.out.println("The first book we have to offer is: " + title); 
		
		//show all the books: 
		System.out.println("We have the following books to offer");
		//for loop to go through array 
		for (String str: books){
			System.out.println(str); 
		}
		
		//Replacing the element 
		System.out.println("The Book Keeper is trading " + books.get(0));
		books.set(0, "Robot Visions"); 
		System.out.println("for " + books.get(0));
		
		//Removing items
		System.out.println("The Book Keeper is giving away " + books.get(1));
		books.remove("The Hobbit"); 
		
		System.out.println("Final Collection " + books);
		
		/*Converting Notes
		String[] simpleArray = books.toArray(new String[books.size()]; 
		System.out.println(Arrays.toString(simpleArray)); 
		
		*/ 
	}

}
