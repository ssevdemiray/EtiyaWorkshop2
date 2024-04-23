public class q1 {

    public static void main(String[] args) {

        String[] urunAdi = {"Kalem", "Defter", "Silgi"};
        double[] urunFiyati = {2.5, 5.0, 1.0};
        int[] gunlukSatisMiktari = {100, 50, 200};


        double toplamSatisGeliri = 0.0;

        // günlük satış geliri:
        for (int i = 0; i < urunAdi.length; i++) {
            double gunlukGelir = urunFiyati[i] * gunlukSatisMiktari[i];
            System.out.println(urunAdi[i] + " ürününden günlük " + gunlukSatisMiktari[i] +
                    " adet satıldı. Günlük gelir: " + gunlukGelir);
            toplamSatisGeliri += gunlukGelir;
        }
        System.out.println("Toplam satış geliri: " + toplamSatisGeliri);
    }
}
