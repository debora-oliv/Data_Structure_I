package list.lista_1;

public class List<T> {
    private Node<T> head;
    private int size;

    public List() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addAtStart(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }
        Node<T> aux = head;
        head = newNode;
        newNode.setNext(aux);
        size++;
    }

    public void addAtEnd(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }
        Node<T> aux = head;
        while (aux.getNext() != null) {
            aux = aux.getNext();
            if (aux.getNext() == null) {
                aux.setNext(newNode);
                size++;
                return;
            }
        }
    }

    public void addAtIndex(T value, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index out of bounds");

        if (index == 0) {
            addAtStart(value);
            return;
        }
        if (index == size) {
            addAtEnd(value);
            return;
        }

        Node<T> aux = head;
        for (int i = 1; i < index; i++) {
            aux = aux.getNext();
        }
        Node<T> newNode = new Node<>(value);
        newNode.setNext(aux.getNext());
        aux.setNext(newNode);
        size++;
    }

    public Integer getIndex(T value) {
        if (existValue(value)) {
            Node<T> aux = head;
            for (int index = 0; index < size - 1; index++) {
                if (aux.getValue().equals(value)) {
                    return index;
                }
                aux = aux.getNext();
            }
        }
        return -1;
    }

    public Boolean existValue(T value) {
        Node<T> aux = head;
        for (int i = 0; i < size - 1; i++) {
            if (aux.getValue().equals(value)) return true;
            aux = aux.getNext();
        }
        return false;
    }

    public Boolean existIndex(Integer index) {
        return index < size - 1;
    }

    public T getElementByIndex(Integer index) {
        if (existIndex(index)) {
            Node<T> aux = head;
            for (int i = 0; i < index; i++) {
                aux = aux.getNext();
            }
            return aux.getValue();
        } else return null;
    }

    public T removeAtStart() {
        if (isEmpty()) {
            return null;
        }

        Node<T> aux = head;
        this.head = aux.getNext();
        size--;
        return aux.getValue();
    }

    public T removeAtEnd() {
        if (isEmpty()) {
            return null;
        }

        if (head.getNext() == null) {
            T removed = head.getValue();
            removeAtStart();
            size--;
            return removed;
        }

        Node<T> aux = head;
        while (aux.getNext().getNext() != null) {
            aux = aux.getNext();
        }
        T removed = aux.getNext().getValue();
        aux.setNext(null);
        size--;
        return removed;
    }

    public T removeAtIndex(Integer index) {
        if (existIndex(index)) {
            if (index == 0) {
                T removedValue = head.getValue();
                removeAtStart();
                size--;
                return removedValue;
            }

            if (index == size - 1) {
                T removedValue = getElementByIndex(size - 1);
                removeAtEnd();
                size--;
                return removedValue;
            }

            Node<T> aux = head;
            for (int i = 0; i < index - 1; i++) {
                aux = aux.getNext();
            }
            Node<T> removedNode = aux.getNext();
            T removedValue = removedNode.getValue();
            aux.setNext(removedNode.getNext());
            size--;
            return removedValue;
        } else
            return null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        String result = "[";
        Node<T> aux = head;
        while (aux.getNext() != null) {
            result += aux.getValue() + ", ";
            aux = aux.getNext();
        }
        result += aux.getValue() + "]";
        return result;
    }

    public Node<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
}
