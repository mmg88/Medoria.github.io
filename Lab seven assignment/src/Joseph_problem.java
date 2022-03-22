public class Joseph_problem {

    public static <E> E Josephus(circulylinkedlist<E> queue, int k) {
        if (queue.IsEmpty( )) return null;
        while (queue.size( ) > 1) {
            for (int i=0; i < k−1 ; i++)
            queue.rotate( );
            E e = queue.dequeue( );
            System.out.println(" " + e + " is out");
        }
        return queue.dequeue( );
    }

    public static <E> circulylinkedlist<E> buildQueue(E a[ ]) {
        circulylinkedlist<E> queue = new LinkedCircularQueue<>( );
        for (int i=0; i<a.length; i++)
            queue.enqueue(a[i]);
        return queue;
    }

    public static void main(String[ ] args) {
        String[ ] a1 = {"Majid", "ahmed", "Wesam", "abd alkreem", "Mohamed", "Ayham"};
        String[ ] a2 = {"Dhiaa", "Mohand", "Salah", "Mazen", "Kreem", "Laith"};
        String[ ] a3 = {"Amjad", "Hussen"};
        System.out.println("First winner is " + Josephus(buildQueue(a1), 3));
        System.out.println("Second winner is " + Josephus(buildQueue(a2), 10));
        System.out.println("Third winner is " + Josephus(buildQueue(a3), 7));
    }
}
