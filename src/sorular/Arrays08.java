package sorular;

import java.util.Arrays;

public class Arrays08 {
    public static void main(String[] args) {
        /*
        Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

Input1={1,2,3,4}

Input2={5,6}

Output={1,2,3,4,5,6}
         */
        int[] Input1={1,2,3,4};

        int []Input2={5,6};
        int myArr []= new int[Input1.length+Input2.length];

        for (int i = 0; i <Input1.length ; i++) {
            myArr[i]=Input1[i];

            } for (int j = Input1.length; j <myArr.length ; j++) {
            myArr[j]=Input2[j-Input1.length];
        }
        System.out.println(Arrays.toString(myArr));

    }
}
