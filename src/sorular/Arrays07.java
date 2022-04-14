package sorular;

public class Arrays07 {
    public static void main(String[] args) {
        /*
        Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.

Eg :

input : {1,2,3,4,5,6,7,8};

output: 36
         */
        int toplam=0;
        int input []= {1,2,3,4,5,6,7,8};
        for (int i = 0; i <input.length ; i++) {
            toplam+=input[i];
        }
        System.out.println(toplam);
    }
}
