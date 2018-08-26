package bean;

public abstract class MediaItem {
private static int tk=100;
private int id;
private String title;
private double price;
private int year;

public int getId() {
	return id;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return id + "\t\t" + title + "\t\t" + price + "\t\t" + year+"\t\t";
}
public MediaItem(String title, double price, int year) {
	this.id=tk++;
	this.title = title;
	this.price = price;
	this.year = year;
}

}
