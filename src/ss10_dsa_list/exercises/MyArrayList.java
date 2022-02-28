package ss10_dsa_list.exercises;

import java.util.Arrays;

public class MyArrayList<E> {
    /**
     * số lượng phần tử trong MyArrayList
     */
    private int size = 0;
    /**
     * Sức chứa của MyArrayList
     */
    private final int DEFAULT_CAPACITY = 10;
    /**
     * Mảng của các phần tử
     */
    Object elements[];

    /**
     * Sức chứa khởi tạo bằng constructor không tham số
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Phương thức constructor với sức chứa được truyền vào
     *
     * @param capacity
     */
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    /**
     * Phương thức trả về số lượng phần tử
     *
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * Phương thức clear 1 ArrayList
     */
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    /**
     * Phương thức add 1 phần tử vào MyArrayList
     *
     * @param element
     * @return
     */
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    /**
     * Phương thức tăng kích thước của MyArrayList
     *
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    /**
     * phương thức lấy 1 phần tử tại vị trí index
     *
     * @param index
     * @return
     */
    public E get(int index) {
        return (E) elements[index];
    }

    /**
     * phương thức tìm vị trí của element
     *
     * @param element
     * @return
     */
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    /**
     * phương thức kiểm tra thử element có tồn tại trong ArrayList không?
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    /**
     * phương thức clone MyArrayList
     *
     * @return
     */
    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    /**
     * xóa 1 phần tử khỏi MyArrayList
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = 0; i < size-1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
