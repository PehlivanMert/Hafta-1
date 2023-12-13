import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenlerimizi oluşturup kullanıcıdan girdi alıyoruz
        int n1,i;
        int sum = 0;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        n1 = input.nextInt();

        /* Girdiğimiz değere kadar olan 3'e Ve 4'e bölünen sayıları toplayan
        sonrasında bu koşula uyan kaç sayı olduğunu bulmamızı sağlayan bir sayaç oluşturuyoruz. */
        for (i = 0 ; i < n1 ; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum = sum + i;
                counter++;
            }
        } /* Sayıların toplamını ve sayıların toplamını sayaca bölerek ortalamasını bulup ekrana yazdırıyoruz
        Sıfırda koşula dahil olduğu için o da sayac tarafından sayılıyor ve ortalamayı etkiliyor */
        System.out.println("Sıfır dahil toplam " + counter + " sayı tam bölünüyor");
        System.out.println("Sayıların toplamı : "+ sum + " Ortalaması : " + sum / counter);
    }
}