package practice.statistics;

public class LinkedListDataSet extends AbstractDataSet {
    private Node head;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public LinkedListDataSet() {
        this.head = null;
    }

    @Override
    public int size() {
        /* TODO */
        int size = 0;
        Node tmp = head;
        while (tmp != null){
            size++;
            tmp = tmp.next;
        }
        return size;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     * @param index
     * @return
     */
    @Override
    public double get(int index) {
        /* TODO */
        return this.getNodeByIndex(index).data;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(double data, int index) {
        /* TODO */
        this.getNodeByIndex(index).data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        Node newNode = new Node(value);
        if(head == null){
            this.head = newNode;
        }else {
            getNodeByIndex(size()-1).next= newNode;
        }

    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        Node newNode = new Node(value);
        if(index == 0){
            newNode.next = head;
            this.head = newNode;
        }else {
            Node prev = getNodeByIndex(index-1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        Node prev = getNodeByIndex(index-1);
        prev.next = prev.next.next;
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        if(head == null){
            return null;
        }else {
            Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp;
        }
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     * @return
     */
    @Override
    public double[] toArray() {
        /* TODO */
        double[] arr = new double[size()];
        for (int i = 0; i < size(); i++) {
            arr[i] = getNodeByIndex(i).data;
        }
        return arr;
    }
}
