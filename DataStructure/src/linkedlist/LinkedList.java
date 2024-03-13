package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;

        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        Node newNode = new Node(input);
        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void add(int index, Object input) {
        if (index == 0) {
            addFirst(input);
        } else {
            Node temp1 = node(index - 1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        String str = "[";
        while (temp.next != null) {
            str+=temp.data+", ";
            temp=temp.next;
        }
        str+=temp.data;
        return str+"]";
    }

    public Object removeFirst(){ 
         Node temp;
         temp=head;
         head=head.next;
         Object returnData=temp.data;
         temp=null;
         size--;

         return returnData;

    }

    public Object remove(int index){
         if(index==0){
            removeFirst();
         }
            Node temp=node(index-1);
            Node deleted=temp.next;

            temp.next=temp.next.next;
            Object returnData=deleted.data;

            if(deleted==tail){
                tail=temp;
            }
            returnData=null;
            size--;
            return returnData;
    }

    public Object removeLast(){
        return remove(size-1);
    }

    public int size(){
        return this.size;
    }

    public Object get(int index){
        Node temp=node(index);
        return temp.data;
    }

    public int indexOf(Object data){
        Node temp =head;
        int index=0;

        while(temp.data != data){
            temp=temp.next;
            index++;

            if(temp==null){
                index=-1;
                return index;
            }
        }

        return index;
    }

    public ListIterator listIterator(){
        return new ListIterator();
    }

    class ListIterator{
        private Node next;
        private Node lastReturned;
        private int nextIndex;

        ListIterator(){
            next=head;
        }

        public Object next(){
            lastReturned=next;
            next=next.next;
            nextIndex++; 
            return lastReturned.data; 
        }

        public boolean hasNext(){
            return nextIndex < size();
        }

        public void add(Object input){
            Node newNode=new Node(input);

            if(lastReturned==null){
                head=newNode;
                newNode.next=next;

            } else {
                lastReturned.next=newNode;
                newNode.next=next;
            }
            lastReturned=newNode;
            nextIndex++;
            size++;
        }

        public void remove(){
            if(nextIndex==0){
                throw new IllegalStateException();
            }
            LinkedList.this.remove(nextIndex-1);
            nextIndex--;  

        }
    }
}
