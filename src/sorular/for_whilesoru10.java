package sorular;

public class for_whilesoru10 {
    public static void main(String[] args) {
        /*
        1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
        OutPut:
        Sayilarin Toplami : 5050
         */

        int sayi=100;
        int toplam=0;

        for (int i = 0; i <=sayi ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);
    }
}
