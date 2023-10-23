package Collection.List;

import java.util.LinkedList;

public class LinkedList_demo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for(Integer i:list){
            System.out.print(i);
        }
        System.out.println();
        list.removeFirst();
        list.removeLast();
        for(Integer i:list){
            System.out.print(i);
        }
    }
}
