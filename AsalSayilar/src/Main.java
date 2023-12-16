public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            int counter = 0;                        // For döngüsü oluşturuyoruz. 2'den 100'e kadar sayıları kontrol edeceğiz.
            for (int j = 2; j < i; j++) {           //Sayıyı 2'den başlatıyoruz çünkü 1 asal sayı değildir.
                if (i % j == 0) {                   //Sayıyı kendisine kadar bölen bir sayı var mı diye bakıyoruz.
                    counter++;                         //Eğer varsa counter değişkenini arttırıyoruz
                }
            }                                        //Eğer counter değişkeni 0'dan farklıysa asal sayı değildir.

            if (counter == 0) {
                System.out.print(i + " - ");
            }
        }
    }
}