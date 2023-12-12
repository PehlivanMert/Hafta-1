import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        int kilo;
        double boy,vki;

        //Scanner sınıfımızı oluşturuyoruz
        Scanner girdi = new Scanner(System.in);

        //Kullanıcıdan boy ve kilo bilgisini alıyoruz
        System.out.print("Lütfen boyunuzu (metre cinsinden virgül ile) giriniz : ");
        boy = girdi.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = girdi.nextInt();

        //Vücut Kitle İndeksini hesaplıyoruz
        vki =  kilo / (boy * boy);

        //Sonucu ekrana yazdırıyoruz.
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

    }
}