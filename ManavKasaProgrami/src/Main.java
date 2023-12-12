import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluşturuyoruz
        int armut,elma,domates,muz,patlican,kivi;
        double armutFiyat,elmaFiyat,domatesFiyat,muzFiyat,patlicanFiyat,kiviFiyat,tutar;

        //fiyatları oluşturuyoruz

        armutFiyat = 22.14;
        elmaFiyat = 8.67;
        domatesFiyat = 11.11;
        muzFiyat = 19.95;
        patlicanFiyat = 13.50;
        kiviFiyat = 18.25;


        //Scanner sınıfı oluşturuyoruz
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan kaç kilo ürün girdisini alıyoruz
        System.out.print("Armut Kaç Kilo ? :");
        armut = input.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        elma = input.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        domates = input.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        muz = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = input.nextInt();

        System.out.print("Kivi Kaç Kilo ? :");
        kivi = input.nextInt();

        //Tutarı hesaplayıp çıktısını ekrana yazdırıyoruz.

        tutar = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlican * patlicanFiyat) + (kivi * kiviFiyat);

        System.out.println("Toplam tutar : " + tutar + " TL");



    }
}