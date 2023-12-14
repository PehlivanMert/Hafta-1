import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n,p;
        int total = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz : ");
        n = inp.nextInt();
        System.out.print("Üssü giriniz : ");
        p = inp.nextInt();

        for(int i = 1 ; i <= p ; i++ ) {
            total *= n;
        } System.out.println(total);
    }
}