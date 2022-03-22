public class circulylinkedlist<E> {
    private Node<E> tail=null;
    private int size=0;

    public circulylinkedlist() {
    }

    public boolean IsEmpty(){

        return size==0;
    }
    public int size(){
        return size;
    }
    public E first(){
        if (IsEmpty()) return null;
        return tail.getNext().getElement();
    }
    public E Last(){
        if (IsEmpty()) return null;
        return tail.getElement();
    }
    public void addFirst(E e) {
        if (IsEmpty()) {
            tail = new Node<>(e, null);
            tail.setNext(tail);

        }
        else
        {
            Node<E> newst=new Node<E>(e,tail.getNext());
            tail.setNext(newst);
        }
        size++;

    }
    public void addLast(E e)
    {
        addFirst(e);
        tail=tail.getNext();
    }
    public E remove(){
        if (IsEmpty())return null;
        Node<E> x=tail.getNext();
        if (x==tail)
            tail=null;
        else tail.setNext(x.getNext());
        size--;
        return x.getElement();
    }
    public void rotate (){
        if (tail!=null)
            tail=tail.getNext();
    }



    private static class Node<E>
    {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
}
