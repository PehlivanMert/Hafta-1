public class Main {
    public static void main(String[] args) {
        int sayi;
        for (int i = 2; i < 100; i++) {             // For döngüsü oluşturuyoruz. 2'den 100'e kadar sayıları kontrol edeceğiz.
            sayi = 0;

            for (int j = 2; j < i; j++) {           //Sayıyı 2'den başlatıyoruz çünkü 1 asal sayı değildir.
                if (i % j == 0) {                   //Sayıyı kendisine kadar bölen bir sayı var mı diye bakıyoruz.
                    sayi++;                         //Eğer varsa sayı değişkenini arttırıyoruz
                }
            }                                        //Eğer sayı değişkeni 0'dan farklıysa asal sayı değildir.
            if (sayi == 0) {
                System.out.println(i);
            }
        }
    }
}