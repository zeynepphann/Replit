package sorular;

public class for_whilesoru04 {
    public static void main(String[] args) {
        /* Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        Input : 6
        Output: 6!=65432*1=720
         */
        int faktoriel=1;
        int sayi=6;
        while (sayi>=1){
            faktoriel*=sayi;
            System.out.print(sayi+ "");
            sayi--;

        }
        System.out.println("=" + faktoriel);

    }
}
