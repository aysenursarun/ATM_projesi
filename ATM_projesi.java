package ATM_projesi;

import java.util.Scanner;

public class ATM_projesi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int right = 3;
		int balance = 1500;
		String kullaniciadi, sifre;

		while (right > 0) {
			System.out.print("Kullanıcı adı: ");
			kullaniciadi = scan.nextLine();
			System.out.print("Şifre: ");
			sifre = scan.nextLine();

			if (kullaniciadi.equals("patika") && sifre.equals("dev123")) {
				System.out.println("Merhaba, Hani Bana Bank'a Hoşgeldiniz!");

				int secim;
				do {

					System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");

					System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
					secim = scan.nextInt();

					switch (secim) {

					case 1:

						System.out.print("Para miktarı: ");
						int miktar = scan.nextInt();
						balance += miktar;
						System.out.println("Güncel bakiye: " + balance);

						break;

					case 2:

						System.out.print("Para miktarı: ");
						int miktar2 = scan.nextInt();
						if (miktar2 > balance) {
							System.out.println("Bakiye yetersiz.");
						} else {
							balance -= miktar2;
							System.out.println("Güncel bakiye: " + balance);
						}

						break;

					case 3:

						System.out.println("Bakiyeniz: " + balance);
						break;

					case 4:

						System.out.println("Tekrar görüşmek üzere.");
						break;

					default:
						System.out.println("Geçersiz seçim yaptınız.");
						break;
					}

				} while (secim != 4);
					break;
			} else {

				right--;
				System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyiniz.");

				if (right == 0) {
					System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
				} else {
					System.out.println("Kalan hakkınız: " + right);
				}
			}
		}
	}
}
