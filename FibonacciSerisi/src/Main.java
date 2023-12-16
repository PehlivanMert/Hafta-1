import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci eleman sayısını giriniz: ");
        int n = input.nextInt();
        int a = 0, b = 1, c = 0;                                                //İlk iki elemanı tanımlıyoruz ve yazdırıyoruz

        System.out.print(n + " Elemanlı Fibonacci Serisi : " + a + " " + b);    //İlk iki elemanı yazdırıyoruz

        for (int i = 2; i < n; i++) {
            c = a + b;                                                          //İlk iki elemanı toplayıp üçüncü elemanı buluyoruz
            System.out.print(" " + c);
            a = b;                                                               //İlk elemanı ikinci elemana eşitliyoruz
            b = c;                                                               //İkinci elemanı üçüncü elemana eşitliyoruz
        }                                                                        //Bu işlemi n'e kadar tekrarlıyoruz

    }
}