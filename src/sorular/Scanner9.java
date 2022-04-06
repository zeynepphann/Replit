package sorular;

import java.util.Scanner;

public class Scanner9 {
    public static void main(String[] args) {

        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.
        Örnek Çıktı:
        1 saat 10 dakika 50 saniye ==>
        4250 saniye
         */

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen saniyeye cevirmek istediginiz saat - dakika- saniyeyi giriniz ");
        int saat= scan.nextInt();
        int dakika= scan.nextInt();
        int saniye= scan.nextInt();

        int toplam= 0;

        toplam=(saat*3600)+(dakika*60)+saniye;
        System.out.println("toplam saniye = " + toplam);

    }
}
