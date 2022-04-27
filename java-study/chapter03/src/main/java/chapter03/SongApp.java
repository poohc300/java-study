package chapter03;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song();
		
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수 작곡");
		song.setYear(2010);
		song.setTrack("3번 track");
		
		song.show();
	}

}
