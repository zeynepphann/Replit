package sorular;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {

    /*
    Kullanıcıya günde ne kadar çay içtiğini ve ne
    kadar şeker kullandığını sorun. Yılda kaç kg şeker
    kullandığını hesaplayın ve yazdırın.
    1 şeker = 1.7 gr
    Örnek Çıktı:
    Yılda 12.41 kg şeker kullanıyor.
     */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen gunde kac bardak cay ictiginizi giriniz");
        int cay= scan.nextInt();
        System.out.println("bir bardak caya kac seker attiginizi giriniz");
        int seker = scan.nextInt();
        double sonuc=(((cay*seker)*365)*1.7)/100;
        System.out.println("sonuc = " + sonuc);


    }

}
