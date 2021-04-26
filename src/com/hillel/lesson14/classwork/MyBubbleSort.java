package com.hillel.lesson14.classwork;

public class MyBubbleSort {
    private long[] a;
    private int array_size;

    public MyBubbleSort(int max_array_size) {
        a = new long[max_array_size];
        array_size = 0;
    }

    public void insert(long value) {
        a[array_size] = value;
        array_size++;
    }

    public void printArray() {
        for (int i = 0; i < array_size; i++) {
            System.out.println("array element : " + a[i] + " ");
        }
    }

    private void swap(int first, int second) {
        long dump = a[first];
        a[first] = a[second];
        a[second] = dump;
    }

    public void myBubbleSorter() {
        for (int out = array_size - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }
}
