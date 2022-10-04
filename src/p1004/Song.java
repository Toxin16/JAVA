package p1004;
//p242 #3
public class Song {
	//필드 선언
	private String title, artist, country, year;
	
	//생성자
	public Song() {
	}
	//생성자2
	public Song(String title, String artist, String country, String year) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	//메소드
	public void show() {
		System.out.println(this.year + "년 " + this.country
				+ "국적의 " + this.artist + "가 부른 " + this.title);
	}
}