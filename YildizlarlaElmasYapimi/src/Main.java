import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,yildiz,bosluk;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz : ");
        n = input.nextInt();

        for (int i = 1 ; i <= n ; i++ ){

            for(bosluk = 1 ; bosluk <= (n - i) ; bosluk++){
                System.out.print(" ");
            }
            for(yildiz = 1 ; yildiz <= ((2 * i)-1); yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-1 ; i >= 1 ; i-- ){

            for(bosluk = 1 ; bosluk <= (n - i) ; bosluk++){
                System.out.print(" ");
            }
            for(yildiz = 1 ; yildiz <= ((2 * i)-1); yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





