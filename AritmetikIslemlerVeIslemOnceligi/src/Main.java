import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturalım
        int a,b,c,sonuc;

        //Scanner sınıfımızı oluşturalım
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri alalım
        System.out.print("İlk Sayıyı Giriniz: ");
        a = inp.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        b = inp.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz: ");
        c = inp.nextInt();

        sonuc = a + b * c - b;

        //Sonucu ekrana yazdıralım.

        System.out.println("Sonuç : " + sonuc);





    }
}