import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişikkenleri tanımlayıp scanner sınıfı ile kullanıcıdan veri alıyoruz.
        int number, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        //For döngüsü ile girilen sayının tam bölenlerini buluyoruz.
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        } //Eğer toplam girilen sayıya eşitse mükemmel sayıdır.Değilse mükemmel sayı değildir yazdırıyor
        if (total == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}