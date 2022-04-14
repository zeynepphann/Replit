package sorular;

import java.awt.datatransfer.DataFlavor;
import java.util.ArrayList;
import java.util.Arrays;

public class Arrays04 {

        /*
Create a custom return type method accepts a name as parameter and prints the name as a char array.

(do not use toCharArray() method)



Output :[J, o, h, n]
         */
        public static void main(String[] args) {
            isim();

        }

    private static void isim() {
        String input = "John";
        String arr[]=input.split("");
        System.out.println(Arrays.toString(arr));


    }


}
