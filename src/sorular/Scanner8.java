package sorular;

import java.util.Scanner;

public class Scanner8 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç basamaklı bir sayı girmesini ve bu
        sayının basamaklarının toplamını bulmasını isteyin.
        Örnek Çıktı:
        Verilen tamsayının rakamları toplamı 10'dur.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        int rakam=0;
        int toplam=0;

        rakam=sayi%10;
        toplam+=rakam;
        sayi=sayi/10;

        rakam=sayi%10;
        toplam+=rakam;
        sayi=sayi/10;

        rakam=sayi%10;
        toplam+=rakam;

        System.out.println("toplam = " + toplam);




    }
}
