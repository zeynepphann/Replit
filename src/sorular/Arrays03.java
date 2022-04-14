package sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        /*
        Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

       input : ade1r4d3

       output : 8

        Hint :
        Use Character.isDigit()
        Integer.valueOf()
         */

        verileninputtakisayilaritoplama();



    }

    private static void verileninputtakisayilaritoplama() {// sout istiyorsak void olabilir
                                                            //toplama islemi olsa bir sey dondururse ne donduruyorsa onu yaz
                                                           // dondurdugu seyle alakali olmali sayiysa int gibi

        String input = "ade1r4d3";
        int toplam=0;

        String stringSayi=input.replaceAll("\\D","");
        String arr[]= stringSayi.split("");

        for (int i = 0; i <arr.length ; i++) {
            toplam+=Integer.valueOf(arr[i]); // arr iyi int cevir toplama ekle

        }
        System.out.println(toplam);





    }
}
