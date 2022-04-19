package sorular;

public class stringBuilder01 {
    public static void main(String[] args) {
        /*
        Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
        and checks if sentence is palindrome or not (without case sensitivity)
        Eg : input : I love Java Output: "Reversed sentence : avaJ evol I . It is not a palindrome"
         */
        StringBuilder input= new StringBuilder("Nazan");
        StringBuilder tersInput= new StringBuilder(input.reverse());
        System.out.println(input.reverse());

        if(tersInput.toString().equalsIgnoreCase(input.toString())){ // string olarak kullanabilmek icin toString() yaptik
            System.out.println("palidorme");
        }else
            System.out.println("palidrome degildir");

    }
}
