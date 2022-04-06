package sorular;

import java.util.Scanner;

public class if_swichsoru05 {
    public static void main(String[] args) {

        /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
        INPUT:
        Ay Numarasi:
        2
        Yil :
        2016
        OUTPUT :
        Subat 2016 29 Gundur.
         Nisan, Haziran, Eylül ve Kasım
         Ocak, Mart, Mayıs, Temmuz, Ağustos, Ekim ve Aralık ayları
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz ");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiginiz ay 30 gundur");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiginiz ay 31 gundur");
                break;
            case 2:
                System.out.println("ogrenmek istediginiz yili yazin ");
                int yil=scan.nextInt();
                if(yil%4==0){
                    System.out.println("ogrenmek istediginiz yilda subat 29 gundur");
                }else {
                    System.out.println("ogrenmek istediginiz yilda subat 28 gundur");
                }
        }

    }
}
