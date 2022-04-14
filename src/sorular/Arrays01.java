package sorular;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
       /*
        Write a return method to reverse number.
        Input : 12345

        Output : 54321
        */

        String str="12345";
        String arr[]= new  String[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            arr[i]=str.substring(i,i+1);

        }
        System.out.println(Arrays.toString(arr));

        String tersString="";
        for (int i = arr.length-1; i >=0 ; i--) {
            tersString+=arr[i];
        }
        System.out.println(tersString);



    }
}
