import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri ve scanner sınıfını oluşturup kullanıcıdan basamak sayısını alıyoruz
        int n, star, blank;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        n = input.nextInt();

        //Yıldızlarla ters üçgen yapmak için bir algoritma kurup for döngüsüyle boşluk ve yıldızları oluşturuyoruz
        for (int i = 1; i <= n; i++) {

            for (blank = 1; blank < i; blank++) {
                System.out.print(" ");
            }
            for (star = 0; star <= (2 * (n - i)); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}