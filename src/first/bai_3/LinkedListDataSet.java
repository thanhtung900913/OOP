package first.bai_3;

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
        int count = 0;
        Node tmp = head;
        while (tmp != null){
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     * @param index
     * @return
     */
    @Override
    public double get(int index) {
        /* TODO */
        if(!checkBoundaries(index, size()-1)){
            throw new ArrayIndexOutOfBoundsException();
        }
        return getNodeByIndex(index).data;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(double data, int index) {
        if(!checkBoundaries(index, size()-1)){
            throw new ArrayIndexOutOfBoundsException();
        }
        Node tmp = getNodeByIndex(index);
        tmp.data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else {
            Node tmp = head;
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
    public void insert(double value, int index) {
        /* TODO */
        if(!checkBoundaries(index, size()-1)){
            throw new ArrayIndexOutOfBoundsException();
        }
        Node newNode = new Node(value);
        if(index == 0){
            newNode.next = head;
            head = newNode;
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
        if(!checkBoundaries(index, size()-1)){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index == 0){
            head = head.next;
        }else {
            Node prev = getNodeByIndex(index-1);
            prev.next = prev.next.next;
        }
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        int count = 0;
        Node tmp = head;
        while (count < index){
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
    public double[] toArray() {
        double[] arr = new double[size()];
        int count = 0;
        Node tmp = head;
        while (tmp != null){
            arr[count] = tmp.data;
            count++;
            tmp = tmp.next;
        }
        return arr;
    }

}
