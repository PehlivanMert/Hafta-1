import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,star,blank;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz : ");
        n = input.nextInt();

        for (int i = 1 ; i <= n ; i++ ){

            for(blank = 1 ; blank <= (n - i) ; blank++){
                System.out.print(" ");
            }
            for(star = 1 ; star <= ((2 * i)-1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-1 ; i >= 1 ; i-- ){

            for(blank = 1 ; blank <= (n - i) ; blank++){
                System.out.print(" ");
            }
            for(star = 1 ; star <= ((2 * i)-1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





