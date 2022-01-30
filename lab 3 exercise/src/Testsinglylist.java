import java.util.Scanner;

public class Testsinglylist {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        Singlylist<Integer> numlist=new Singlylist<>();
//        numlist.addfirst(1);
//        numlist.addLast(10);
//        System.out.println("size of list="+numlist.size());
//        System.out.println("First element of list="+numlist.first());
//        System.out.println("Last element of list="+numlist.last());
        Singlylist<String> stringlist=new Singlylist<>();
        System.out.println("size of list"+stringlist.size());
        System.out.println("First element of list="+stringlist.first());
        System.out.println("Last element of list="+stringlist.last());
        for (int i = 0; i <5 ; i++) {
            stringlist.addLast(input.next());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(stringlist.removefirst()+"\t");
        }
        System.out.println("size of list="+stringlist.size());
        System.out.println("First element of list="+stringlist.first());
        System.out.println("Last element of list="+stringlist.last());
    }
}
