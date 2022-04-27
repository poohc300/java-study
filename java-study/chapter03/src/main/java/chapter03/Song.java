package chapter03;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public String getComposer() {
		return composer;
	}

	public int getYear() {
		return year;
	}

	public String getTrack() {
		return track;
	}

	
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}

	public void setArtist(String artist) {
		// TODO Auto-generated method stub
		this.artist = artist;
	}

	public void setAlbum(String album) {
		// TODO Auto-generated method stub
		this.album = album;
	}

	public void setComposer(String composer) {
		// TODO Auto-generated method stub
		this.composer = composer;
	}

	public void setYear(int year) {
		// TODO Auto-generated method stub
		this.year = year;
	}

	public void setTrack(String track) {
		// TODO Auto-generated method stub
		this.track = track;
	}
	
	public void show() {
		System.out.println(
				artist + " " +
				title + " ( " +
				album + ", " +
				year + ", " +
				track + ", " +
				composer + " ) "
		);
	}

	
}
