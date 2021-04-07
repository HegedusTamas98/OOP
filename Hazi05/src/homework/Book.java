package homework;

public class Book {
	private String author;
	private String title;
	private int yearOfPublication;
	private int price;
	
	public Book (String szerz, String cim, int kiad, int ar)
	{
		super();
		this.author = szerz;
		this.title = cim;
		this.yearOfPublication = kiad;
		this.price = ar;
	}
	
	public Book (String szerz, String cim)
	{
		super();
		this.author = szerz;
		this.title = cim;
		this.price = 2500;
		java.time.LocalDate currentDate = java.time.LocalDate.now(); 
		this.yearOfPublication = currentDate.getYear();
	}
	
	
	public void increasePrice(int percentage) {
		if (percentage > 0) {
			price += Math.round(price*(float)percentage/100);
		}	
	}
	
	public String displayInfo() {
		return author + ": " + title + ", " + yearOfPublication + ". Price: " + price + " Ft";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		if (yearOfPublication >= 1950 && yearOfPublication <= 2021)
			this.yearOfPublication = yearOfPublication;
		else 
			this.yearOfPublication = 2021;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 1000)
			this.price = price;
		else
			this.price = 1000;
	}

	public static int comparePublicationDate(Book egy,Book ketto)
	{
		if(egy.getYearOfPublication()>ketto.getYearOfPublication())
		{
			return 1;
		}
		else
			{
				if(egy.getYearOfPublication()<ketto.getYearOfPublication())
				{
					return 2;
				}
			}
		
		return 0;
	}
	
	
	@Override
	public String toString()
		{
		
		
		return this.displayInfo();
			
		
		}
	
}
