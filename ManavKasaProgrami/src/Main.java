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
        int armut,elma,domates,muz,patlıcan,kivi;
        double tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armut = input.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        elma = input.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        domates = input.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        muz = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcan = input.nextInt();

        System.out.print("Kivi Kaç Kilo ? :");
        kivi = input.nextInt();

        tutar = (armut * 22.14) + (elma * 8.67) + (domates * 11.11) + (muz * 19.95) + (patlıcan * 13.50) + (kivi * 18.25);

        System.out.println("Toplam tutar : " + tutar);



    }
}