import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz: ");
        int limit = input.nextInt();
        int number ;
        int basValue;
        int basPow;

        for(number = 1; number < limit ; number++) {
            int basNumber = 0;
            int result = 0;
            int tempNumber = number;
            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }
            tempNumber = number;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }

            if (result == number){
                System.out.println(number + " sayısı bir armstrong sayıdır.");
            }
        }
    }
}
