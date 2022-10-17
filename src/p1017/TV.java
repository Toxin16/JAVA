package p1017;

interface Device {
	void on();	//추상메소드
	void off();
}
public class TV implements Device{	//p314 #10
	public static void main(String[] args) {
		TV myTV = new TV();
		myTV.on();
		myTV.watch();
		myTV.off();
	}
	@Override
	public void on() {
		System.out.println("켜졌습니다.");
	}
	public void watch() {
		System.out.println("방송중입니다.");
	}
	@Override
	public void off() {
		System.out.println("종료합니다.");
	}
}
