package ss10_danh_sach.ArrayList;

import java.util.Arrays;

public class MyList <E>{
    private  int size = 0;
    private  static  final  int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(){
        this.elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    public int size() {
        return this.size;
    }
    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(this.size() + 1);
        }
        int[] tmp = new int[size()];
        for(int i = index + 1; i < this.size(); i++ ) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        this.size ++;
    }
    public E remove(int index) {
        for(int i = index; i < this.size(); i++) {
            elements[i] = elements[i+1];
        }
        this.size--;
        return (E) elements[index];
    }
    public E clone() {
        return (E) this.elements;
    }
    public boolean contains(E obj) {
        for(int i = 0 ;i < this.size(); i++) {
            if(elements[i] == obj) return true;
        }
        return  false;
    }
    public int indexOf(E obj) {
        for(int i = 0 ;i < this.size(); i++) {
            if(elements[i] == obj) return i;
        }
        return -1;
    }
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(this.size() + 1);
        }
        elements[size++] = e;
        return true;
    }
    public E get(int i ) {
        if(i < 0 || i > this.size() ) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
        return (E) elements[i];
    }
    public void clear() {
        this.elements = null;
        this.size = 0;
    }
}
