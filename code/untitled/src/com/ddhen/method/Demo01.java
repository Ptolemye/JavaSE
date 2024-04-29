package com.ddhen.method;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        add(1,2);
        System.out.println(Arrays.toString(a));
        String b=Arrays.toString(a);
        System.out.println(b+'c');
    }
    //加上static后就是类方法，其他方法可以直接引用
    public static void add(int a,int b){
        a=b;
    }
}
