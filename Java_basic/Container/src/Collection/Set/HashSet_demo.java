package Collection.Set;
import java.io.*;
import java.util.*;
public class HashSet_demo {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<String>();
        list.add("江");
        list.add("山");
        list.add("如");
        list.add("此");
        list.add("多");
        list.add("娇");
        for(String i:list){
            System.out.println(i);
        }
    }
}
