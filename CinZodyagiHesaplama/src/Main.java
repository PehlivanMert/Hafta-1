import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluşturup kullanıcıdan girdiyi alıyoruz
        int dogumyili;
        Scanner girdi= new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        dogumyili = girdi.nextInt();

        //Doğum yılının 12'ye bölümünden kalan rakama göre burcu bulan koşulu tanımlıyoruz
        if(dogumyili>0) {

            if (dogumyili % 12 == 0) {
                System.out.println("Çin Zodyağı Burcunuz: Maymun");

            } else if (dogumyili % 12 == 1) {
                System.out.println("Çin Zodyağı Burcunuz: Horoz");

            } else if (dogumyili % 12 == 2) {
                System.out.println("Çin Zodyağı Burcunuz: Köpek");

            } else if (dogumyili % 12 == 3) {
                System.out.println("Çin Zodyağı Burcunuz: Domuz");

            } else if (dogumyili % 12 == 4) {
                System.out.println("Çin Zodyağı Burcunuz: Fare");

            } else if (dogumyili % 12 == 5) {
                System.out.println("Çin Zodyağı Burcunuz: Öküz");

            } else if (dogumyili % 12 == 6) {
                System.out.println("Çin Zodyağı Burcunuz: Kaplan");

            } else if (dogumyili % 12 == 7) {
                System.out.println("Çin Zodyağı Burcunuz: Tavşan");

            } else if (dogumyili % 12 == 8) {
                System.out.println("Çin Zodyağı Burcunuz: Ejderha");

            } else if (dogumyili % 12 == 9) {
                System.out.println("Çin Zodyağı Burcunuz: Yılan");

            } else if (dogumyili % 12 == 10) {
                System.out.println("Çin Zodyağı Burcunuz: At");

            } else if (dogumyili % 12 == 11) {
                System.out.println("Çin Zodyağı Burcunuz: Koyun");
            }
        } else {
            System.out.println("Hatalı Tarih Girdiniz");
        }
    }
}

