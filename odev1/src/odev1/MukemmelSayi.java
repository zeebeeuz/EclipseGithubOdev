package odev1;

public class MukemmelSayi {
	public static void main(String[] args) {
		// 6 => 1+2+3 =6
		int number = 28;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;

			}
		}
		if (total == number) {
			System.out.println(number + " mükemmel sayıdır.");
		} else {
			System.out.println(number + " mükemmel sayı değildir.");
		}

	}
}
