package list.exercicio_2;

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

    public void addAtEnd (T value) {
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
