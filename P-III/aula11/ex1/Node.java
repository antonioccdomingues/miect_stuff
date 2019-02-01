package aula11.ex1;

public class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> previous;

    public Node(T value, Node<T> previous, Node<T> next) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}
