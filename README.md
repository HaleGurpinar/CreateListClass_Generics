# JAVA GENERICS - Create Our Own List Class

We are designing a class in Java where we hold data using the generic.

The purpose of the class is to keep a dynamic Array in it and dynamically retrieve the data type. For this, a generic class must be created.

NOTE : THE COLLECTION CLASS WILL NOT BE USED ! WE MUST CREATE OUR OWN LISTING CLASS.

Class features:


* The default size of the array in the class is 10 and the number of elements of the array should increase by 2 times as needed.


* The class must have two types of constructor methods


* MyList() : If the empty constructor is used, the initial size of the array should be 10.


* MyList(int capacity) : The initial value of the array should be taken from the capacity parameter.


* size() : Returns the number of elements in the array.


* getCapacity() : returns the capacity of the array.


* add(T data) : It should be used to add an element to the array of the class. If there is not enough space in the array, the array size should be doubled.



* get(int index): returns the value at the given index. Returns null if invalid index is entered.


* remove(int index): should delete the data in the given index and shift the data after the deleted index to the left. Returns null if invalid index is entered.


* set(int index, T data) : should replace the data in the given index with a new one. Returns null if invalid index is entered.


* String toString() : A method that lists the elements in the array of the class.
