package methods;

import java.util.Scanner;

public class zscdsd {
	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		
		boolean varMi = false;
		int[] sayilar={1,5,4,7,8,9,6,9,45,4,3};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bulmak istediğiniz sayı kaçtır? : ");
		int aranacakSayi = scanner.nextInt();
		
		for(int sayi: sayilar) {
			if(sayi==aranacakSayi) {
				varMi = true;
				break;
			}
		}if(varMi) {
			System.out.println(aranacakSayi+": Bu sayı mevcuttur.");

		}else {
			System.out.println(aranacakSayi+": Bu sayı mevcut değildir.");
		}
	}
}
