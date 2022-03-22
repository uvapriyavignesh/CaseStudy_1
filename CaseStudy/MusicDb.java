package CaseStudy;

public class MusicDb {
	private String title;
	private String artist;
	private String type;
	private int id;
	private String albumName;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	@Override
	public String toString() {
		int size = 20;
		while (title.length() <= size) {

			title = title + " ";
		}
		while (artist.length() <= size) {

			artist = artist + " ";
		}
		while (albumName.length() <= size + 5) {

			albumName = albumName + " ";
		}
		while (type.length() <= size) {

			type = type + " ";
		}

		return "|" + id + "|" + title + "|" + artist + "|" + albumName + "|" + type + "|";
	}

	public MusicDb(int id, String title, String artist, String albumName, String type) {
		super();
		this.title = title;
		this.artist = artist;
		this.type = type;
		this.id = id;
		this.albumName = albumName;
	}

	public MusicDb() {
		super();
	}

}
