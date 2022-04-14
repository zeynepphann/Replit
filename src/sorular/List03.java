package sorular;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
        /*
        Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

Note: Upper and lower case letters, spaces and special characters will not be changed.

Input :

It is very nice to write code.

Output :

.edoc etirw ot ecin yrev si tI
         */

        String cumle="It is very nice to write code.";

        List<String> tersCumle=new ArrayList<>();
        for (int i = cumle.length()-1; i >=0 ; i--) {
           tersCumle.add(cumle.substring(i,i+1));
        }

        System.out.println(tersCumle);

        String yeniTersCumle="";
        for (int i =0 ; i <tersCumle.size() ; i++) {
          yeniTersCumle += tersCumle.get(i);
        }
        System.out.println(yeniTersCumle);
    }
}
