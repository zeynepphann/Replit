package sorular;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        Ornek Cikti : Alan: 9   Cevre: 12
         */
        Scanner scan=new Scanner(System.in);
        System.out.println(" karenin bir kenar uzunlugunu giriniz");
        double sayi= scan.nextDouble();
        double alan= sayi*sayi;
        double cevre=4*sayi;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
