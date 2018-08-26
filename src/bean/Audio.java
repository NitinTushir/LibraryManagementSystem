package bean;

public class Audio extends MediaItem{
private String artist;

public String getArtist() {
	return artist;
}

public void setArtist(String artist) {
	this.artist = artist;
}

@Override
public String toString() {
	return super.toString()+artist;
}

public Audio(String title, double price, int year, String artist) {
	super(title, price, year);
	this.artist = artist;
}

}
