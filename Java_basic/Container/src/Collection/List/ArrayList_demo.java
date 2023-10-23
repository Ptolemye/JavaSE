package Collection.List;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayList_demo {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        for(Integer i:array){
            System.out.print(i);
        }//遍历方式1
        System.out.println();
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
        }//遍历方式2
        System.out.println();
        array.remove(5);
        for(Integer i:array){
            System.out.print(i);
        }//遍历方式1
    }
}
