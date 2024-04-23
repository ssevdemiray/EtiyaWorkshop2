    public class q2 {

    public static void main(String[] args) {

        String[] yemekler = {"Izgara Tavuk", "Pasta", "Pizza", "Salata", "Köfte"};
        double[] fiyatlar = {25.0, 20.0, 30.0, 15.0, 35.0};
        int[] populerlikDerecesi = {4, 3, 5, 2, 4};

        System.out.println("Restoran Menüsü:");
        for (int i = 0; i < yemekler.length; i++) {
            System.out.println(yemekler[i] + " - " + fiyatlar[i] + " TL - Popülerlik: " + populerlikDerecesi[i]);
        }
    }
}
