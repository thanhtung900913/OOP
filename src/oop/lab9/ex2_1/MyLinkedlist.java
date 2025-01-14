package oop.lab9.ex2_1;

public class MyLinkedlist extends MyAbstracList{
    MyLinkedListNode head;
    int size;

    public MyLinkedlist() {
        head = null;
        size = 0;
    }
    private MyLinkedListNode getNodeByIndex(int index){
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current =current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if(index == 0){
            head = new MyLinkedListNode(o, head);
        }else{
            MyLinkedListNode current = getNodeByIndex(index -1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size ++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode prev = getNodeByIndex(index - 1);
            prev.setNext(prev.getNext().getNext());
        }
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);
        MyLinkedListNode node = getNodeByIndex(index);
        return node.getNext();
    }

    @Override
    public int size() {
        return size;
    }
}
