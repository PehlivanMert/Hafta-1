import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        int i = 1;
        int ebob = 1;

        System.out.print("a sayısını giriniz: ");
        a = input.nextInt();

        System.out.print("b sayısını giriniz: ");
        b= input.nextInt();

        if (a <= b) {
            while (i <= a) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Girilen sayıların Ebobu: " + ebob);
            System.out.println("Girilen sayıların Ekoku: " + (a*b)/ebob);
        } else {
            while (i <= b) {
                if (a % i ==0 && b % i ==0) {
                    ebob=i;
                }
                i++;
            }
            System.out.println("Girilen sayıların Ebobu: " + ebob);
            System.out.println("Girilen sayıların Ekoku: " + (a*b)/ebob);
        }

    }
}