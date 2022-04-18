package sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List04 {
    public static void main(String[] args) {
        /*
        INPUT :
     list1={"Ali","Veli","Ayse","Fatma","Omer"}

     OUTPUT :

     [Veli,Omer]
         */
     ArrayList<String > isimler=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        ArrayList<String > asizisimler=new ArrayList<>();

        for (String w:isimler
             ) {
            if (!w.toLowerCase().contains("a")){
                asizisimler.add(w);
            }
        }
        System.out.println(asizisimler);
    }
}
