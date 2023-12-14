import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");
        int n = input.nextInt();
        System.out.print("Faktöriyeli alınacak 2. sayıyı giriniz: ");
        int r = input.nextInt();

        int nFaktoriyel = 1;
        int rFaktoriyel = 1;
        int nEksiRFaktoriyel = 1;

        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }
        for (int i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            nEksiRFaktoriyel *= i;
        }
        int kombinasyon = nFaktoriyel / (rFaktoriyel * nEksiRFaktoriyel);

        System.out.println("C(n,r) = " + kombinasyon);
    }
}
