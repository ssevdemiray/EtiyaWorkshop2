import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] urunler = {"Kalem", "Defter", "Silgi", "Kitap"};
        double[] fiyatlar = {2.5, 5.0, 1.0, 15.0};
        int[] sepetMiktarlari = new int[urunler.length];

        System.out.println("Ürünler ve Fiyatları:");
        for (int i = 0; i < urunler.length; i++) {
            System.out.println((i + 1) + ". " + urunler[i] + " - " + fiyatlar[i] + " TL");
        }

        boolean devam = true;
        while (devam) {
            System.out.print("Lütfen bir ürün seçin (Çıkış için 0): ");
            int secim = scanner.nextInt();

            if (secim == 0) {
                // Kullanıcı çıkış yapmak istediğini belirtirse:
                devam = false;
            } else if (secim > 0 && secim <= urunler.length) {
                // Kullanıcı geçerli bir ürün seçti
                int index = secim - 1;
                System.out.print("Kaç adet eklemek istiyorsunuz? ");
                int miktar = scanner.nextInt();
                sepetMiktarlari[index] += miktar; // Sepete seçilen ürün miktarını eklemem gerekiyor.
                System.out.println(urunler[index] + " sepete eklendi (" + miktar + " adet).");
            } else {
                System.out.println("Geçersiz bir seçim yaptınız. Tekrar deneyin.");
            }
        }

        System.out.println("Alışveriş Sepeti:");
        for (int i = 0; i < urunler.length; i++) {
            if (sepetMiktarlari[i] > 0) {
                System.out.println(urunler[i] + " - " + sepetMiktarlari[i] + " adet - Toplam Fiyat: " + (fiyatlar[i] * sepetMiktarlari[i]) + " TL");
            }
        }

        scanner.close();
    }
}
