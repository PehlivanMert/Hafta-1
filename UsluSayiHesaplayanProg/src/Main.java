import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int base,power;
        int total = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz : ");
        base = inp.nextInt();
        System.out.print("Üssü giriniz : ");
        power = inp.nextInt();

        for(int i = 1 ; i <= power ; i++ ) {
            total *= base;
        } System.out.println(total);
    }
}