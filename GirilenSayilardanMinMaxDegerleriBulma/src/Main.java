import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri tanımlayıp Scanner sınıfı ile kullanıcıdan veri alıyoruz.
        int n, sayi, enKucuk = 0, enBuyuk = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();

        //For döngüsü ile kullanıcıdan alınan sayıları karşılaştırıyoruz.
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = input.nextInt();

        //İlk girilen sayıyı en büyük ve en küçük sayı olarak atıyoruz.
            if (i == 1) {
                enBuyuk = sayi;
                enKucuk = sayi;
            } else if (sayi > enBuyuk) {
                enBuyuk = sayi;
            } else if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        //En büyük ve en küçük sayıları ekrana yazdırıyoruz.
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
