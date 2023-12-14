import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri ve scanner sınıfını oluşturup kullanıcıdan basamak sayısını alıyoruz
        int n,star,blank;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        n = input.nextInt();

        //Yıldızlarla ters üçgen yapmak için bir algoritma kurup for döngüsüyle boşluk ve yıldızları oluşturuyoruz
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