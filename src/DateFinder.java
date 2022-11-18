//Fevzi ÜRETEN (22097728)

import java.util.Scanner;

public class DateFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int yil, hesap;
		int merkez, artikYil, toplam;
		System.out.print("Yıl giriniz = ");
		while (true) {
			yil = scanner.nextInt();
			merkez = yil - 1900;
			artikYil = merkez / 4;
			toplam = artikYil + merkez;
			hesap = toplam % 7;
			
			switch (hesap) {
			case 0:
				System.out.println(yil + " yılında 29 Ekim Pazartesi gününe denk gelmektedir.");
				break;
			case 1:
				System.out.println(yil + " yılında 29 Ekim Salı gününe denk gelmektedir.");
				break;
			case 2:
				System.out.println(yil + " yılında 29 Ekim Çarşamba gününe denk gelmektedir.");
				break;
			case 3:
				System.out.println(yil + " yılında 29 Ekim Perşembe gününe denk gelmektedir.");
				break;
			case 4:
				System.out.println(yil + " yılında 29 Ekim Cuma gününe denk gelmektedir.");
				break;
			case 5:
				System.out.println(yil + " yılında 29 Ekim Cumartesi gününe denk gelmektedir.");
				break;
			case 6:
				System.out.println(yil + " yılında 29 Ekim Pazar gününe denk gelmektedir.");
				break;
			default:
				System.out.println("Yeniden deneyiniz.");
				break;
			}
			System.out.print("\nYeni yılı giriniz: ");
		}

	}
}