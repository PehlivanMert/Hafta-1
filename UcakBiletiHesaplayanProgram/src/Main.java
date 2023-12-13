import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluşturuyoruz
        int yas, tip, km;
        double tutar;

        //Kullanıcıdan bilgileri alıyoruz
        Scanner girdi = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz : ");
        yas = girdi.nextInt();

        System.out.print("Km'yi giriniz: ");
        km = girdi.nextInt();

        System.out.print("Tek yön için 1 ; Gidiş Dönüş için 2; ");
        tip = girdi.nextInt();

        tutar = km * 0.10;

        //Temel indirimleri tanımlıyoruz

        double indirim1 = tutar - (tutar * 0.50);
        double indirim2 = tutar - (tutar * 0.10);
        double indirim3 = tutar - (tutar * 0.30);

        // Uçuş Tipine göre switch case ile koşul oluşturuyoruz

        switch (tip) {
            case 1:
                // Km sıfırdan büyük olmalı.
                if (km > 0) {

                    // yaşlara göre indirimli fiyatları yazdırıyoruz
                    if ( yas > 0 && yas < 12) {
                        System.out.println("Bilet Ücretiniz: " + indirim1 + "TL");

                    } else if (yas < 24 && yas > 12) {
                        System.out.println("Bilet Ücretiniz: " + indirim2 + "TL");

                    } else if (yas >= 65) {
                        System.out.println("Bilet Ücretiniz: " + indirim3 + "TL");

                    } else if (yas < 65 && yas > 23){
                        System.out.println("Bilet Ücretiniz: " + tutar + " TL");

                    } else {
                        System.out.println("Hatalı Veri Girdiniz!");
                    }
                } else {
                    System.out.println("Hatalı Veri Girdiniz!");
                }
                break;

            // Gidiş Dönüş için switch case oluşturuyoruz
            case 2:
                if (km > 0) {
                    if (yas > 0 && yas < 12) {
                        System.out.println("Bilet Ücretiniz: " + ((indirim1-(indirim1 * 0.20))*2) + "TL");

                    } else if (yas < 24 && yas > 12) {
                        System.out.println("Bilet Ücretiniz: " + ((indirim2-(indirim2 * 0.20))*2) + "TL");

                    } else if (yas >= 65 ) {
                        System.out.println("Bilet Ücretiniz: " + ((indirim3-(indirim3 * 0.20))*2) + "TL");

                    } else if (yas < 65 && yas > 23 ) {
                        System.out.println("Bilet Ücretiniz: " + ((tutar-(tutar * 0.20))*2) + "TL");
                    } else {
                        System.out.println("Hatalı Veri Girdiniz!");
                    }
                } else {
                    System.out.println("Hatalı Veri Girdiniz!");
                }
                break;
            default:
                System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}