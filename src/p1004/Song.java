package p1004;
//p242 #3
public class Song {
	//�ʵ� ����
	private String title, artist, country, year;
	
	//������
	public Song() {
	}
	//������2
	public Song(String title, String artist, String country, String year) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	//�޼ҵ�
	public void show() {
		System.out.println(this.year + "�� " + this.country
				+ "������ " + this.artist + "�� �θ� " + this.title);
	}
}