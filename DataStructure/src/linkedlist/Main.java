package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers= new LinkedList();
        numbers.addLast(30);
        numbers.addLast(20);
        numbers.addLast(10);


        LinkedList.ListIterator i=numbers.listIterator();
        i.remove();



    } 
}
