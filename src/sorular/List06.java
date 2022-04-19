package sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List06 {
    public static void main(String[] args) {
        /*
        Write a program to find the common elements between two String Arrays (without case sensitivity)

Input1 : {John,Brad,Ange,Sofia,Emily}

Input2 : {sofia,brad,grace,emily,hazel}

Output : [sofia,brad,emily]
         */
       String Input1[] = {"John","Brad","Ange","Sofia","Emily"};
       String Input2[] ={"sofia","brad","grace","emily","hazel"};

        List<String> tekrarlanaList=new ArrayList<>();
        for (int i = 0; i <Input1.length ; i++) {
            for (int j = 0; j <Input2.length ; j++) {
                if (Input1[i].equalsIgnoreCase(Input2[j])){
                    tekrarlanaList.add(Input1[i]);
                }
                
            }
            
        }
        System.out.println(tekrarlanaList);




    }

}
