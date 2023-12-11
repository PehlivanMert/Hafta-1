// Kdv Hesaplayan Program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri Tanımlıyoruz.
        double tutar, kdvtutar;

        //Scanner sınıfımızı oluşturuyoruz.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan girdi alıyoruz.
        System.out.print("Tutarı Giriniz: ");
        tutar= input.nextDouble();
        // Tutar 1000 TL den Küçükse %18 Değilse % 8 Kdv Ekliyoruz.
        if (tutar < 1000){
            kdvtutar = tutar * 1.18;
            System.out.println("Kdvli tutar :" + kdvtutar + "TL");
        }else {
            kdvtutar = tutar * 1.08;

            System.out.println("Kdvli tutar :" + kdvtutar + "TL");
        }


    }
}
