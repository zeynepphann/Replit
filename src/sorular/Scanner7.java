package sorular;

import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args) {
        /*
        Kullanıcı tarafından girilen
         DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println(" Double bir sayi giriniz : ");
        double sayi= scan.nextFloat();
        int yenisayi=(int) sayi;
        System.out.println("Tam sayi degeri :" + yenisayi);
    }
}
