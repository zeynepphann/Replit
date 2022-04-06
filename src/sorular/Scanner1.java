package sorular;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        /*Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextInt();
        double sonuc=(sayi*sayi*sayi)/2;
        System.out.println("sonuc = " + sonuc);
    }
}
