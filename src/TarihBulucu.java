//Fevzi ÜRETEN  (22097728)

import java.util.Scanner;

public class TarihBulucu {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		int yil, hesap,artikYil;
		System.out.print("Yıl giriniz = ");
		int merkez;
		int toplam;
		
	while(true) {	
		yil = scanner.nextInt();
		merkez = yil - 1900;
		artikYil = merkez / 4;
		toplam = artikYil + merkez;
		hesap = toplam%7;
			
		
		if(hesap == 0) {
			System.out.println(yil + " yılında 29 Ekim Pazartesi gününe denk gelmektedir.");
		}
		else if(hesap == 1){
			System.out.println(yil + " yılında 29 Ekim Salı gününe denk gelmektedir.");
		}
		else if(hesap == 2){
			System.out.println(yil + " yılında 29 Ekim Çarşamba gününe denk gelmektedir.");
		}
		else if(hesap == 3){
			System.out.println(yil + " yılında 29 Ekim Perşembe gününe denk gelmektedir.");
		}
		else if(hesap == 4){
			System.out.println(yil + " yılında 29 Ekim Cuma gününe denk gelmektedir.");
		}
		else if(hesap == 5){
			System.out.println(yil + " yılında 29 Ekim Cumartesi gününe denk gelmektedir.");
		}
		else if(hesap == 6){
			System.out.println(yil + " yılında 29 Ekim Pazar gününe denk gelmektedir.");
		}

		System.out.print("\nYeni yıl giriniz = ");
		
	}
}
}