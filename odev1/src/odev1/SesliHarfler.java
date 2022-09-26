package odev1;

public class SesliHarfler {
	public static void main(String[] args) {
		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Harf kalın sesidir");
			break;

		default:
			System.out.println("İnce sesli harftir");
		}

	}
}
