package mitAssignments;

public class Library{
	
	// Add the missing implementation to this class
	
	String address;
	
	 Book [] book;
	
	public Library( String address) {
		
		this.address = address;
		this.book = new Book[4];
	}//end of constructor
	
	public String toString() {
		
		return " address: " + address;
		
	}
	
	public void addBook(Book book2) {
		// TODO Auto-generated method stub
		for(int i = 0; i < book.length; ) {
				if (book[i] == null) {
					book[i] = book2;
					break;
				}
				else
					i++;
		}
		
	}
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	public void printAddress() {
		System.out.println(this.address);
	}
	public void borrowBook(String s) {
		//int count = 0;
		try {
		
		for(int i = 0;i < this.book.length; i++) {
			
		
			if(s.equals(this.book[i].title)){
			  
				if(this.book[i].borrowed == false) {
			System.out.println("You successfully borrowed" + s);
			this.book[i].borrowed = true;
			break;
			
				}
			else  {
				System.out.println("Sorry, this book is already borrowed.");
				break;
				
			}
		}
		}
			
			
	}
		catch( NullPointerException e) {
			
			System.out.println("Sorry, this book is not in our catalog");
		}
		
		
		
		
}
	public void printAvailableBooks(){
		
		for(Book b: this.book) {
			if(b==null) {
				System.out.println("no book in catalog");
				break;
			}
			else if(b.borrowed == false)
				System.out.println(b.title);
		}
	}
	public void returnBook(String s) {
		for(Book b: book) {
		if(s.equals(b.title)) {
			b.borrowed = false;
		System.out.println("you successfully returned "+ s);
	    }
      }
  }
	

	public static void main(String[] args) {
	// Create two libraries
	 Library firstLibrary = new Library("10 Main St.");
	 Library secondLibrary = new Library("228 Liberty St.");
	
	// Add four books to the first library
	firstLibrary.addBook(new Book("The Da Vinci Code"));
	firstLibrary.addBook(new Book("Le Petit Prince"));
	firstLibrary.addBook(new Book("A Tale of Two Cities"));
	firstLibrary.addBook(new Book("The Lord of the Rings"));
	
	
	System.out.println();
	// Print opening hours and the addresses
	System.out.println("Library hours:");
	printOpeningHours();
	
	
	System.out.println();
	
	System.out.println("Library addresses:");
	firstLibrary.printAddress();
	secondLibrary.printAddress();
	
	System.out.println();
	
	// Try to borrow The Lords of the Rings from both libraries
	System.out.println("Borrowing The Lord of the Rings:");
	
	firstLibrary.borrowBook("The Lord of the Rings");
	firstLibrary.borrowBook("The Lord of the Rings");
	secondLibrary.borrowBook("The Lord of the Rings");
	
	System.out.println(); 
	
	// Print the titles of all available books from both libraries
	System.out.println("Books available in the first library:");
	firstLibrary.printAvailableBooks();
	System.out.println();
	System.out.println("Books available in the second library:");
	secondLibrary.printAvailableBooks();
	System.out.println();
	
	
	// Return The Lords of the Rings to the first library
	System.out.println("Returning The Lord of the Rings:");
	firstLibrary.returnBook("The Lord of the Rings");
	System.out.println();
	// Print the titles of available from the first library
	System.out.println("Books available in the first library:");
	firstLibrary.printAvailableBooks();
	System.out.println();
	secondLibrary.printAvailableBooks();
	}

	
	
}
//end of Library
