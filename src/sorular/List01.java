package sorular;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    /*
    Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

input :

Learning java is easy

output:

maximum occurring character is : af
     */
    public static void main(String[] args) {

       String input= "Learning java is easy";
       List<String>inputlist=new ArrayList<String>();
       int sayac=0;

        for (int i = 0; i <input.length() ; i++) {
            inputlist.add(input.substring(i,i+1));
            if (inputlist.equals(input.substring(i,i+1))){
                sayac++;

            }
            sayac=0;
        }
        System.out.println(sayac);

    }
}
