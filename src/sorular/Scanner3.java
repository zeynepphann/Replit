package sorular;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(" dikdortgenin iki kenar uzunlugunu giriniz");
        double sayi= scan.nextDouble();
        double sayi2=scan.nextDouble();
        double alan= sayi2*sayi;
        double cevre=(2*sayi)+(2*sayi2);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
