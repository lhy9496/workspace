
public class Music {
	
	// 필드 영역
	private String title;
	private String artist;
		
	//생성자 영역
	public Music() {
		super();
	}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	// 메소드 영역
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
}
