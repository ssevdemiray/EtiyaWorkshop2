import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        List<String> ogrenciAdlari = new ArrayList<>();
        List<Integer> ogrenciNotlari = new ArrayList<>();

        ogrenciAdlari.add("Ali");
        ogrenciNotlari.add(85);
        ogrenciAdlari.add("Ayşe");
        ogrenciNotlari.add(75);
        ogrenciAdlari.add("Mehmet");
        ogrenciNotlari.add(60);
        ogrenciAdlari.add("Nur");
        ogrenciNotlari.add(95);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Silmek istediğiniz not aralığı (örn. 0-70): ");
        String notAraligi = scanner.nextLine();
        scanner.close();


        for (int i = 0; i < ogrenciNotlari.size(); i++) {
            int not = ogrenciNotlari.get(i);
            if (notAraligiIceriyor(notAraligi, not)) {
                // Not aralığına uyan öğrenciyi listeden kaldıralım
                ogrenciAdlari.remove(i);
                ogrenciNotlari.remove(i);
                i--; // Liste boyutu değiştiği için indeksi bir geri aldım.
            }
        }

        System.out.println("Not aralığı " + notAraligi + " altında kalan öğrenciler silindi.");
        System.out.println("Güncellenmiş Öğrenci Listesi:");
        for (int i = 0; i < ogrenciAdlari.size(); i++) {
            System.out.println(ogrenciAdlari.get(i) + " - Not: " + ogrenciNotlari.get(i));
        }
    }

    // Verilen not aralığını parse ederek notun bu aralığa dahil olup olmadığını kontrol eden metod
    private static boolean notAraligiIceriyor(String notAraligi, int not) {
        String[] aralik = notAraligi.split("-");
        int altSinir = Integer.parseInt(aralik[0].trim());
        int ustSinir = Integer.parseInt(aralik[1].trim());
        return not >= altSinir && not <= ustSinir;
    }
}

