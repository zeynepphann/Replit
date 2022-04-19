package sorular;

import java.util.ArrayList;
import java.util.List;

public class List07 {
    public static void main(String[] args) {
        /*
      write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array

       Input :{1,2,3,4,5,6}

       element:6

      Output : [1,2,3,4,5]
         */
        List<Integer> yeniList=new ArrayList<>();
        int input[] = {1,2,3,4,5,6};
        for (int i = 0; i <input.length ; i++) {
            yeniList.add(input[i]);
        }
        System.out.println(yeniList);
        yeniList.remove(input.length-1);
        System.out.println(yeniList);

    }
}
