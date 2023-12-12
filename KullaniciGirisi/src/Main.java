import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        String userName, password, newpassword,change;

        //Scanner sınıfında bir değişken oluşturup kullanıcıdan kullanıcı adı ve şifreyi alıyoruz
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        // İf-Else ile kullanıcı Adı ve şifre Kontrolü yapıyoruz
        if (userName.equals("PehlivanMert") && (password.equals("Mert12345"))) {
            System.out.print("Giriş Başarılı");

        //Kullanıcı adı yanlışsa
        } else if (!userName.equals("PehlivanMert") && (password.equals("Mert12345"))) {
            System.out.println("Kullanıcı Adınızı Kontrol Ediniz!");

        //Şifre yanlışsa uyarı mesajı ve şifre değiştirme seçeneği
        } else if (userName.equals("PehlivanMert") && (!password.equals("Mert12345"))) {
            System.out.println("Parolanızı Kontrol Ediniz!");
            System.out.print("Paralonızı Değiştirmek İstiyorsanız 1'i  \nDevam Etmek İçin 2'yi tuşlayın =>");
            change = input.nextLine();

       //Switch Case ile şifre değiştirme işlemi yapıyoruz
            switch (change) {
                case "1":
                    //Eski ve yeni şifre aynı ise uyarı mesajı
                    System.out.print("Yeni Parolanızı Giriniz: ");
                    newpassword = input.nextLine();

                    if (newpassword.equals("Mert12345")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                    }else if (!newpassword.equals("Mert12345")) {
                        System.out.println("Şifre Oluşturma Başarılı.");
                    }
                    break;
                    //Şifre değiştirmek istemiyorsa;
                case "2":
                    System.out.println("Tekrar Deneyiniz! ");
                    break;
            }
        //Kullanıcı adı ve şifre yanlışsa;
        } else {
            System.out.println("Bilgilerinizi Kontrol Ediniz. ");
        }
    }
}