
public class Music {
	private String musicname;
	private String singer;
	private int playtime;
	private String musicpath;
	public Music(String musicname, String singer, int playtime, String musicpath) {
		super();
		this.musicname = musicname;
		this.singer = singer;
		this.playtime = playtime;
		this.musicpath = musicpath;
	}
	public String getMusicname() {
		return musicname;
	}
	public String getSinger() {
		return singer;
	}
	public int getPlaytime() {
		return playtime;
	}
	public String getMusicpaht() {
		return musicpath;
	}
    
	
}
