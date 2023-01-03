import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
	public static void main(String[] args) {
		InetAddress addr1 = null, addr2 = null;
		System.out.print("호스트 이름을 입력 : ");
		Scanner sc = new Scanner(System.in);
		String url = sc.nextLine();
		
		try {
			addr1 = InetAddress.getByName(url);
			addr2 = InetAddress.getLocalHost();
		}	catch (UnknownHostException e) {
		}
		System.out.println(url + "의 IP 주소 : ");
		System.out.println(addr1.getHostAddress());
		System.out.println("로컬 IP 주소 : ");
		System.out.println(addr2.getHostAddress());
	}
}
