package odev1;

public class ReCapDemo1 {
	public static void main(String[] args) {
		int sayi = 100;
		int sayi2 = 56;
		int sayi3 = 101;
		int enBuyuk = sayi;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük = " + enBuyuk);

	}
}
