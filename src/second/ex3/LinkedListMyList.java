package second.ex3;

public class LinkedListMyList extends AbstractMyList {
    private Node start;
    private Node end;
    private int size;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public LinkedListMyList() {
        this.start = null;
    }

    @Override
    public int size() {
        /* TODO */
        int count = 0;
        Node tmp =start;
        while (tmp != null){
            count++;
            tmp=tmp.next;
        }
        return count;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     * @param index
     * @return
     */
    @Override
    public int get(int index) {
        /* TODO */
        if(start == null){
            return 0;
        }
        return getNodeByIndex(index).data;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(int data, int index) {
        /* TODO */
        Node current = getNodeByIndex(index);
        current.data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(int value) {
        /* TODO */
        Node newNode = new Node(value);
        newNode.next = start;
        start = newNode;

    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(int value) {
        /* TODO */
        Node newNode = new Node(value);
        if(start == null){
            start = newNode;
        }else {
            Node tmp = start;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPos(int value, int index) {
        /* TODO */
        Node newNode = new Node(value);
        Node prev = getNodeByIndex(index-1);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if(!checkBoundaries(index, size()-1)){
            throw new ArrayIndexOutOfBoundsException();
        }
        else if(index == 0){
            start=start.next;
        }else {
            Node prev = getNodeByIndex(index - 1);
            prev.next = prev.next.next;
        }
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        int count = 0;
        Node tmp = start;
        while (count < index && tmp.next != null){
            count++;
            tmp = tmp.next;
        }
        return tmp;
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     * @return
     */
    @Override
    public int[] toArray() {
        /* TODO */
        int[] arr = new int[size()];
        Node tmp = start;
        int count = 0;
        while (tmp != null){
            arr[count] = tmp.data;
            tmp = tmp.next;
            count++;
        }
        return arr;
    }
}
