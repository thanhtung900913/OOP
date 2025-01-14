package oop.lab9.ex2_1;

public class MyArrayList extends MyAbstracList{
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;
    public MyArrayList(){
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }
    @Override
    public void add(Object o) {
        if(size >= elements.length-1){
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (size >= elements.length - 1) {
            enlarge();
        }

        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = o;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size-1);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }
    void enlarge(){
        Object[] tmp = new Object[elements.length*2];
        System.arraycopy(elements, 0, tmp,0,  elements.length);
        elements = tmp;
    }
}
