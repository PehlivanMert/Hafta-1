import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy,vki;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = girdi.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = girdi.nextInt();

        vki =  kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);

    }
}