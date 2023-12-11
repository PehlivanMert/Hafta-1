/* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kilometreyi Giriniz: ");
        km = inp.nextInt();
        tutar = 10 + (km * 2.20);

        if(tutar < 20) {
            System.out.println("Tutar : 20 TL");
        }else {
            System.out.println("Tutar : " + tutar + " TL");
        }


    }
}