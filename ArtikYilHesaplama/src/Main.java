import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Scanner sınıfında bir değişken üretip kullanıcıdan girdi alıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        int yil = inp.nextInt();

        //Koşulları oluşturuyoruz ve ekrana yazdırıyoruz
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır.");
                } else {
                    System.out.println(yil + " bir artık yıl değildir.");
                }
            } else {
                System.out.println(yil + " bir artık yıldır.");
            }
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}