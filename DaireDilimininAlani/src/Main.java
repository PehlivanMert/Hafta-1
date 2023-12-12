import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        int r,a;

        Scanner input = new Scanner(System.in);
        System.out.print("Daire diliminin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açısını giriniz: ");
        a = input.nextInt();

        double alan = (pi * (r*r) * a) / 360;

        System.out.println("Daire diliminin alanı: " + alan);


    }
}