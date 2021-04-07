package homework;

public class Homework {
	
	public static void main(String[] args)  {
		
		//Book book = new Book();
		/*book.setAuthor("J.K. Rowling");
		book.setTitle("Harry Potter");
		
		// Test with invalid values
		book.setYearOfPublication(2025);
		book.setPrice(0);
		System.out.println(book.displayInfo());
		book.increasePrice(-10);
		System.out.println(book.displayInfo());
		
		// Test with valid values
		book.setYearOfPublication(2008);
		book.setPrice(3500);
		System.out.println(book.displayInfo());
		book.increasePrice(10);
		System.out.println(book.displayInfo());
		*/
		
		
		
		Book eggy = new Book("J.K. Rowling","Harry Potter",2021, 2500);
		Book ketto = new Book("J.K. Rowling","Harry Potter3");
		System.out.printf(eggy.toString());
		System.out.printf(ketto.toString());
		System.out.print(Book.comparePublicationDate(eggy, ketto));
	}
	


}
