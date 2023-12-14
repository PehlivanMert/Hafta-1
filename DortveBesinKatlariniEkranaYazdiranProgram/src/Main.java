import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int limit,d,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        limit = input.nextInt();
        System.out.print("Dördün Katları : ");

        for(d = 1 ; d < limit ; d *= 4){
            System.out.print(d + ",");
        }
        System.out.println();
        System.out.print("Beşin Katları : ");
        for(b = 1; b < limit ; b *= 5){
            System.out.print(b + ",");
        }
    }
}