import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluşturuyoruz
        int mat,fizik,turkce,kimya,muzik;
        double avarage;

        //Scanner sınıfından bir değişken oluşturuyoruz
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan ders puanlarını girmesini istiyoruz
        System.out.print("Matematik Notu : ");
        mat = input.nextInt();

        System.out.print("Fizik Notu : ");
        fizik = input.nextInt();

        System.out.print("Türkçe notu : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notu : ");
        kimya = input.nextInt();

        System.out.print("Müzik Notu : ");
        muzik = input.nextInt();

        // Notların 0 - 100 arası notların ortalamaya katılması için koşul oluşturuyoruz
        int isMat = 0 <= mat && mat <= 100 ? mat : 0;
        int isFizik = 0 <= fizik && fizik <= 100 ? fizik : 0;
        int isTurkce = 0 <= turkce && turkce <= 100 ? turkce : 0;
        int isKimya = 0 <= kimya && kimya <= 100 ? kimya : 0;
        int isMuzik = 0 <= muzik && muzik <= 100 ? muzik : 0;

        //Derslerin ortalmasını alıyoruz
        avarage = (isMat + isFizik + isTurkce + isKimya + isMuzik) / 5;

        //Geçme koşulu oluşturup durumu ve ortalamayı ekrana yazdırıyoruz

        if(avarage <= 55){
            System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Sınıfı Geçtiniz");
        }
        System.out.println("Ortalamanız : " + avarage);
    }
}