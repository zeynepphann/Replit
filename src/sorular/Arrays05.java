package sorular;

public class Arrays05 {
    public static void main(String[] args) {
        /*
        Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}
         */

        int input[]= {1,2,3,4,5,6,7};
        for (int i = 0; i <input.length ; i++) {
            if (input.length%2==0){
                System.out.println("giridiniz sayinin uzunlugu cift sayidir");
            break;
            }else if (input.length%2!=0){
                System.out.println(input[((input.length-1) /2)]);
            }break;


        }
    }
}
