import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci eleman sayısını giriniz: ");
        int n = input.nextInt();
        int a = 0, b = 1, c = 0;

        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}