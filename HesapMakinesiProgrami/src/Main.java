import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluşturuyoruz
        int n1, n2, secim;

        //Scanner sınıfında bir değişken oluşturuyoruz.
        Scanner sc = new Scanner(System.in);

        //Sayıları kullanıcıdan alıyoruz
        System.out.print("İlk sayıyı giriniz: ");
        n1 = sc.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = sc.nextInt();

        //Yapılmak istenilen işlemi kullanıcıdan alıyoruz
        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        secim = sc.nextInt();

        //İf Else ile yapılacak işleme göre koşul oluşturup ekrana yazdırıyoruz
        if (secim == 1) {
            System.out.println("Toplam : " + (n1 + n2));
        } else if (secim == 2) {
            System.out.println("Çıkarma : " + (n1 - n2));
        } else if (secim == 3) {
            System.out.println("Çarpma : " + (n1 * n2));
        } else if (secim == 4) {
            if (n2 != 0) {                                                  // Bir sayı 0'a bölünemediği için iç içe if else kullanıyoruz.
                System.out.println("Bölme : " + (n1 / n2));
            } else {
                System.out.println("Bir sayı 0'a bölünemez !");
            }
        } else {                                                             // Hatalı tuşlama yapılırsa uyarı measjı yazdırıyoruz
            System.out.println("Hatalı İşlem Yaptınız!");
        }
    }
}