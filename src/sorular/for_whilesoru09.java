package sorular;

public class for_whilesoru09 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        Input :1238
        Output :Girilen Numananin Tersi: 8321
         */

        int sayi =1234;

        String yeniSayi= String.valueOf(sayi); // sayi'yi string yaptik

        String tersSayi="";
        for (int i = yeniSayi.length()-1; i >=0 ; i--) {
            tersSayi+=yeniSayi.charAt(i);

        }
        System.out.println(tersSayi+ ": sayinin string hali ");

        int tersSayiInt= Integer.parseInt(tersSayi); // stringi integer yaptik

        System.out.println(tersSayiInt + ": sayinin integeri ");





    }
}
