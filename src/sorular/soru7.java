package sorular;

public class soru7 {
    public static void main(String[] args) {

        /*
        Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
        int a= 3;  int b= 5;  Ornek Cikti:  a=5  b=3
         */

        int temp=0;
        int a= 3;
        int b=5;

        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+" b= "+b);
    }
}
