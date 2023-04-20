package com.patika;

import java.lang.reflect.Array;

 class MyList<T>{

    private int capacity=10;
    private int size;

     T[] list= (T[]) new Object[capacity];

    public MyList() {
       T[] list=(T[]) new Object[10];
    }

    public MyList(int capacity) {
        this.capacity=capacity;
        T[] list= (T[]) new Object[capacity];
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
    public void add(T data) {
        if (this.size==this.getCapacity()){
            this.capacity=2*capacity;
        T[] newList=(T[]) new Object[capacity];
        for (int i=0;i< list.length;i++){
            newList[i]=list[i];
        }
        newList[list.length]=data;
        this.list=newList;
        } else{
            list[this.size()]=data;
        }
    }

     public boolean isEmpty(){
         int count =0;
         for (int i = 0; i < list.length ; i++) {
             if(list[i]==null){
                 count++;
             }

         }if(count==list.length){
             return true;
         }

         else{
             return false;
         }
     }

    }

