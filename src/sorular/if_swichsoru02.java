package sorular;

import java.util.Scanner;

public class if_swichsoru02 {
    public static void main(String[] args) {
        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J*** W****

CCN : **** **** **** 1478

Ilk Harfler Buyuk harf ile baslamalidir.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi  giriniz : ");
        String isim=scan.nextLine();
        System.out.println("lutfen soy isminizi  giriniz : ");
        String soyIsim=scan.nextLine();
        System.out.println("lutfen kredi karti numaranizi giriniz: ");
        String kartNo= scan.nextLine();

        String gizliIsim=isim.substring(0,1)+isim.substring(1).replaceAll("\\S","*");

        String gizlisoyIsim=soyIsim.substring(0,1)+soyIsim.substring(1).replaceAll("\\S","*");

        System.out.println("isim = " + gizliIsim);
        System.out.println("soy isim=" + gizlisoyIsim);

        String gizliKartNo="" ;

        if (kartNo.length()==16){
            System.out.println("kart  numarasi= **** **** **** **** "+kartNo.substring(12,kartNo.length()));
        } else{
            System.out.println("Gecerli kart numarasi giriniz");
        }







    }
}
