package sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class List08 {
    /*
    Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.

        Input :

       I love Java.

       Output:

       Reversed sentence : avaJ evol I. It is not a palindrome"
     */
    public static void main(String[] args) {

        String input= "nazan";
        List<String > tersInput =new ArrayList<>();
        input=input.trim();
        for (int i = input.length()-1 ; i >=0 ; i--) {
            tersInput.add(input.substring(i,i+1));


        }
        String  tersStr="";
        for (int i = 0; i <tersInput.size() ; i++) {
            tersStr+=tersInput.get(i);

        }
        System.out.println(tersStr);

        if (input.equalsIgnoreCase(tersStr)){
            System.out.println(" girdiginiz cumle polidrome'dur ");
        }else System.out.println("girdiginiz cumle polidrome degildir");


    }





}
