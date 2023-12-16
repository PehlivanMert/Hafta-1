import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci eleman sayısını giriniz: ");
        int n = input.nextInt();
        int a = 0, b = 1, c = 0;                                                //İlk iki değişkeni tanımlıyoruz ve yazdırıyoruz

        System.out.print(n + " Elemanlı Fibonacci Serisi : " + a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;                                                          //İlk iki elemanı yani a+ b toplayıp c'ye atıyoruz
            System.out.print(" " + c);
            a = b;                                                               //a'yı b'ye  atıyoruz
            b = c;                                                               //b'ye c'yi atıyoruz
        }                                                                        //Bu işlemi n kadar tekrar ediyoruz.

    }
}