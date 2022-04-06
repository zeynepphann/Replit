package sorular;

import java.util.Scanner;

public class if_swichsoru6 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("3 harfli bir isim yaziniz");
        String isim= scan.next();

        System.out.println(isim.length()!=3 ? "lutfen gecerli bir isim yaziniz " : isim.charAt(0)==isim.charAt(1)|| isim.charAt(0)==isim.charAt(2)
                ||isim.charAt(1)==isim.charAt(2) ? "isim ayni karaktere sahip " :
                " isim ayni karaktere sahip degil");





    }
}
