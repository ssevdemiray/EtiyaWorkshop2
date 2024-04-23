import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {

        List<String> gorevler = new ArrayList<>();
        List<Boolean> tamamlandiMi = new ArrayList<>();

        gorevler.add("Matematik ödevini yap");
        tamamlandiMi.add(false); // tamamlanmadı
        gorevler.add("Alışverişe git");
        tamamlandiMi.add(true); //tamamlandı
        gorevler.add("Kitap oku");
        tamamlandiMi.add(false); // tamamlanmadı

        // Görevleri listeliyorum.
        System.out.println("Günlük Görevler:");
        for (int i = 0; i < gorevler.size(); i++) {
            String gorev = gorevler.get(i);
            boolean tamamlandi = tamamlandiMi.get(i);
            System.out.println((i + 1) + ". " + gorev + " - Tamamlandı mı? " + (tamamlandi ? "Evet" : "Hayır"));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Güncellemek veya silmek istediğiniz görevin numarasını girin (0 çıkış): ");
        int secim = scanner.nextInt();
        scanner.nextLine();

        if (secim > 0 && secim <= gorevler.size()) {
            // Kullanıcı görevi güncellemek veya silmek istiyor
            System.out.print("Görevi güncellemek mi (g) yoksa silmek mi (s) istiyorsunuz? (g/s): ");
            String islem = scanner.nextLine();

            if (islem.equalsIgnoreCase("g")) {
                // Görevi güncelleme
                System.out.print("Yeni görevi girin: ");
                String yeniGorev = scanner.nextLine();
                gorevler.set(secim - 1, yeniGorev);
                System.out.println("Görev güncellendi.");
            } else if (islem.equalsIgnoreCase("s")) {
                // Görevi silme
                gorevler.remove(secim - 1);
                tamamlandiMi.remove(secim - 1);
                System.out.println("Görev silindi.");
            } else {
                System.out.println("Geçersiz işlem seçildi.");
            }
        } else if (secim == 0) {
            System.out.println("Programdan çıkılıyor...");
        } else {
            System.out.println("Geçersiz görev numarası.");
        }

        // Güncellenmiş görevleri listele
        System.out.println("Güncellenmiş Günlük Görevler:");
        for (int i = 0; i < gorevler.size(); i++) {
            String gorev = gorevler.get(i);
            boolean tamamlandi = tamamlandiMi.get(i);
            System.out.println((i + 1) + ". " + gorev + " - Tamamlandı mı? " + (tamamlandi ? "Evet" : "Hayır"));
        }

        scanner.close();
    }
}

