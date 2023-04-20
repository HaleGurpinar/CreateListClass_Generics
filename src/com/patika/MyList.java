package com.patika;

import java.lang.reflect.Array;

 class MyList<T>{

    private int capacity;
    private int size;

    private Object[] array;

    public MyList() {
        array=new Object[10];

    }

    public MyList(int capacity) {

    }

    public int size(int size){
        return array.length;
    }

    public int getCapacity() {
        return capacity;
    }
}
