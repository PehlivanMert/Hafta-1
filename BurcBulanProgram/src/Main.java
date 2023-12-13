import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan doğum ayını ve gününü alıyoruz
        System.out.print("Doğum gününüzü giriniz: ");
        int gun = input.nextInt();

        System.out.print("Doğum ayınızı giriniz: ");
        int ay = input.nextInt();

        //Doğum tarihine göre burçları gösteren sadece if - else kullanılarak yazılmış bir koşul oluşturup ekrana yazdırıyoruz

        if (ay == 1) {
            if (gun < 22) {
                System.out.println("Oğlak");
            } else {
                System.out.println("Kova");
            }
        } else if (ay == 2) {
            if (gun < 20) {
                System.out.println("Kova");
            } else {
                System.out.println("Balık");
            }
        } else if (ay == 3) {
            if (gun < 21) {
                System.out.println("Balık");
            } else {
                System.out.println("Koç");
            }
        } else if (ay == 4) {
            if (gun < 22) {
                System.out.println("Koç");
            } else {
                System.out.println("Boğa");
            }
        } else if (ay == 5) {
            if (gun < 22) {
                System.out.println("Boğa");
            } else {
                System.out.println("İkizler");
            }
        } else if (ay == 6) {
            if (gun < 23) {
                System.out.println("İkizler");
            } else {
                System.out.println("Yengeç");
            }
        } else if (ay == 7) {
            if (gun < 23) {
                System.out.println("Yengeç");
            } else {
                System.out.println("Aslan");
            }
        } else if (ay == 8) {
            if (gun < 23) {
                System.out.println("Aslan");
            } else {
                System.out.println("Başak");
            }
        } else if (ay == 9) {
            if (gun < 23) {
                System.out.println("Başak");
            } else {
                System.out.println("Terazi");
            }
        } else if (ay == 10) {
            if (gun < 23) {
                System.out.println("Terazi");
            } else {
                System.out.println("Akrep");
            }
        } else if (ay == 11) {
            if (gun < 22) {
                System.out.println("Akrep");
            } else {
                System.out.println("Yay");
            }
        } else if (ay == 12) {
            if (gun < 22) {
                System.out.println("Yay");
            } else {
                System.out.println("Oğlak");
            }

        } else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}



