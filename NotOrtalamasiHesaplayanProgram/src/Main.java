/* Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.*/

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturuluyoruz

        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalama;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan değerleri alıyoruz

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        //Ortalama hesaplaması yapacağız.

        ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        //Ortalama değerini yazdırıyoruz.

        System.out.println("Ortalamanız: " + ortalama);
        //Ortalama 60'dan büyükse sınıfı geçti, küçükse sınıfta kaldı yazdırıyoruz.

        System.out.println(ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");



    }
}