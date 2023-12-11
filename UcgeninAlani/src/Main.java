import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        int b = input.nextInt();
        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        int c = input.nextInt();
        double u = (a + b + c) / 2.0;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + alan);
    }
}