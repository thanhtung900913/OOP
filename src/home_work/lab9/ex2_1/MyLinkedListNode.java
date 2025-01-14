package home_work.lab9.ex2_1;

public class MyLinkedListNode {
    Object payload;
    MyLinkedListNode next;
    public MyLinkedListNode(Object payload){
        this.payload = payload;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload() {
        return payload;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setPayload(Object dataValue) {
        this.payload = dataValue;
    }

    public void setNext(MyLinkedListNode nextValue) {
        this.next = nextValue;
    }
}
