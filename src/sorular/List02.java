package sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        /*
        Create a 10-element list. Swap the 8th element with the 3rd element.

INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
         */
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        List <String> yeniList= Arrays.asList(names);

        int ilkIndex=8;
        int ikinciIndex=3;
        String temp="";

        if((ilkIndex> yeniList.size()-1)|| (ikinciIndex>yeniList.size()-1)|| ilkIndex<0
        || ikinciIndex<0){
            System.out.println("Lutfen gecerli bir index giriniz");
        }else {
            temp=yeniList.get(ilkIndex);
            yeniList.set(ilkIndex, yeniList.get(ikinciIndex));
            yeniList.set(ikinciIndex,temp);
        }

        System.out.println(yeniList);


    }
}
