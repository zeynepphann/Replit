package sorular;

public class Arrays02 {
    public static void main(String[] args) {
        /*
        Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

        Input : Coding is greate.

        Output : .etaerg si gnidoC
         */
       String  Input = "Coding is greate.";
       String tersInput="";
       String arr[]=new String[Input.length()];//stringi arrye cevirdik
        for (int i = Input.length()-1; i >=0; i--) {
           arr[i]= Input.substring(i,i+1);
           tersInput+=arr[i];
        }
        System.out.println(tersInput);


    }
}
