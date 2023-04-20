package com.patika;

import java.lang.reflect.Array;

 class MyList<T>{

    private int capacity=10;
    private int size=0;

     T[] list;

    public MyList() {
       /* setCapacity(10);
       this.list=(T[]) new Object[getCapacity()];*/
        this(10);
    }

    public MyList(int capacity) {
        this.size=0;
        this.capacity=capacity;
        this.list= (T[]) new Object[capacity];
    }

    public int size(){
        int c=0;
        for (T t : list) {
            if (t != null) {
                c++;
            }
        }
        return c;
    }

    public int getCapacity() {
        return capacity;
    }

     public void setCapacity(int capacity) {
         this.capacity = capacity;
     }

     public void add(T data) {
        if (this.size>=this.capacity){
            int newCapacity= capacity*2;
            T[] newList=(T[]) new Object[(newCapacity)];
            System.arraycopy(list, 0, newList, 0, list.length);
            list=newList;
        }else{
            list[size++]= data;
        }

    }

     public boolean isEmpty(){
         return size==0;
         }



    }

