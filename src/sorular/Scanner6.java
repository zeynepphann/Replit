package sorular;

import java.util.Scanner;

public class Scanner6{
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı
        short değişken tipine dönüştürün ve konsolda yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir float deger giriniz ");

        float sayi= scan.nextFloat();
        short yenisayi=(short) sayi;
        System.out.println("yenisayi = " + yenisayi);
        






    }
}
