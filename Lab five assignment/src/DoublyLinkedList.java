/**
 * Created by Mohamed Al_shamsi  on 16/02/2022.
 */
public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> trailer;

    public DoublyLinkedList() {
        header = new Node<E>(null, null, null);
        trailer = new Node<E>(null, header, null);
        header.setNext(trailer);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    //////////////////////////////Question one R_3_11//////////////////////////////
    public int size(){
        int si=0;
        if (trailer==null) return si;

        Node<E> x=header;
        while (x.getNext()!=trailer){
            si++;
            x=x.getNext();
        }
        return si;
    }
    //////////////////////////////Question two R_3_16/////////////////////////
    public boolean equals(DoublyLinkedList l1, DoublyLinkedList l2) {
        boolean b = false;
        if (l1.isEmpty() && l2.isEmpty()){
            System.out.println("The Tow Lists Are Empty");
            return true;
        }
        if (l1.size() == l2.size()){
            int n = l1.size ();
            Node<E> n1 = l1.header.getNext();
            Node<E> n2 = l2.header.getNext();
            while (n != 0){
                if ( n1.getElement() .equals( n2.getElement())){
                    b = true;
                }
                else b=false;
                n1 = n1.getNext();
                n2 = n2.getNext();
                n--;
            }
        }return b;
    }

    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }

    private void addBetween(E e,Node<E> p,Node<E>n)
    {
        Node<E> newst=new Node<E>(e,p,n);
        p.setNext(newst);
        n.setPrev(newst);
    }

    public void addFirst(E element)
    {

        addBetween(element,header,header.getNext());
    }
    public void addLast(E element)
    {

        addBetween(element,trailer.getPrev(),trailer);
    }

   private E remove(Node<E> x)
   {
       Node<E> p=x.getPrev();
       Node<E>n=x.getNext();
       p.setNext(n);
       n.setPrev(p);
       return x.getElement();
   }

  public  E removeFirst()
  {
      if (isEmpty())return null;
     return remove(header.getNext());
  }
    public  E removeLast()
    {
        if (isEmpty())return null;
        return remove(trailer.getPrev());
    }

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
