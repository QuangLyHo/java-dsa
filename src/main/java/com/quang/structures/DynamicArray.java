package com.quang.structures;

public class DynamicArray<T> {
    int size;
    int capacity = 10;
    T[] array;

    @SuppressWarnings("unchecked")
    public DynamicArray() {
        this.array = (T[]) new Object[capacity]; 
    }

    @SuppressWarnings("unchecked")
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public void add(T data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, T data) {
        if (size >= capacity) {
            grow();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(T data) {
        for (int i  = 0; i < size; i++) {
            if (array[i].equals(data)) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;

                if (size <= (int)(capacity / 3)) {
                    shrink();
                }

                break;
            }
        }
    }

    public int search(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }

        return -1;
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        int newCapacity = (int)(capacity * 2);
        T[] newArray = (T[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        capacity = newCapacity;
        array = newArray;
    }

    @SuppressWarnings("unchecked")
    private void shrink() {
        int newCapacity = (int)(capacity / 2);
        T[] newArray = (T[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

        String string = "";

        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }

        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
    }
}
