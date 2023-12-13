import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturduk
        int n;
        int total = 0;
        Scanner inp = new Scanner(System.in);

        // En az bir kez çalışması için do - while döngüsü oluşturduk ve koşul belirledik
        do {
            System.out.print("Sayıyı giriniz : ");
            n = inp.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                total += n;
            }
        }while (n % 2 == 0);
        //Toplamı ekrana yazdırdık
        System.out.println("Toplam : " + total);
    }
}