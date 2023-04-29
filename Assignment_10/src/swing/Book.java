package swing;

import java.util.Comparator;

public class Book {
	
	//Here are properties for each book.
	//TODO: Create a method that returns a list of type book, reading each entry from a file. 
	
	public String id; 
	public String goodReadId;
	public String bestBookId;
	public String workId;
	public String booksCount;
	public String ibsn;
	public String ibsn13;
	public String authors;
	public String orginalPublicationYear;
	public String orginalTitle;
	public String title;
	public String languageCode;
	public String averageRating;
	public String ratingsCount;
	public String workRatingsCount;
	public String workTextReviewsCount;
	public String ratings1;
	public String ratings2;
	public String ratings3;
	public String ratings4;
	public String ratings5;
	public String imageURl;
	
	static Comparator<Book> compareByIBSN = new Comparator<Book>() {
		@Override
		public int compare(Book o1, Book o2) {
			return o1.getIBSN().compareTo(o2.getIBSN());
		}
	};

	static Comparator<Book> compareByAuthor = new Comparator<Book>() {
		@Override
		public int compare(Book b1, Book b2) {
			return b1.getAuthor().compareTo(b2.getAuthor());
		}
	};
	
	static Comparator<Book> compareByYear = new Comparator<Book>() {
		@Override
		public int compare(Book b1, Book b2) {
			return b1.getYear().compareTo(b2.getYear());
		}
	};
	
	protected Integer getYear() {
		String formattedYear = Book.this.orginalPublicationYear;

	//	formattedYear = String.format("%.0f", formattedYear);

		if (formattedYear.equals("")) {
			return -1;
		}
		else {
			formattedYear = formattedYear.substring(0, formattedYear.length() - 2);
		}
		Integer year = Integer.parseInt(formattedYear);
		return year;
	}
	
	protected String getIBSN() {
		return Book.this.ibsn;
	}
	
	protected String getAuthor() {
		return Book.this.authors;
	}
}	

