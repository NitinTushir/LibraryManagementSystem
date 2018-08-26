package bean;

public class Book extends MediaItem{
private String author;

	@Override
	public String toString() {
		return super.toString()+author;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(String title, double price, int year, String author) {
		super(title, price, year);
		this.author = author;
	}

}
