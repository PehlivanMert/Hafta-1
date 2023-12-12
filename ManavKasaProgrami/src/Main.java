/*  Meyveler ve KG Fiyatları
    Armut : 22,14 TL
    Elma : 8,67 TL
    Domates : 11,11 TL
    Muz: 19,95 TL
    Patlıcan : 13,50 TL
    Kivi : 18,25 TL */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluşturuyoruz
        int armut,elma,domates,muz,patlican,kivi;
        double tutar;

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

        tutar = (armut * 22.14) + (elma * 8.67) + (domates * 11.11) + (muz * 19.95) + (patlican * 13.50) + (kivi * 18.25);

        System.out.println("Toplam tutar : " + tutar);



    }
}