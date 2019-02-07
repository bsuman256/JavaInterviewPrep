package mymockitoproject.Misc;

public class MyLinkedList {

    //TO:DO not completed

    private static final Lnode myList = new Lnode();

    public static void main(String[] args) {

        myList.add(1);
        myList.add(2);
        myList.add(3);

        myList.print(myList);



       /* LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        list.addFirst(0);
        list.addLast(4);
        list.stream().forEach(System.out::print);*/


    }
}

class Lnode{
    private Lnode first;
    private Lnode last;
    public Lnode() {
    }

    public Lnode(int element) {
        this.element = element;
        this.next=null;
        this.prev=null;
    }

    public Lnode( Lnode prev, int element,Lnode next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    Lnode prev;
    int element;
    Lnode next;

    boolean add(int element){
        linkLast(element);
        return true;
    }

    private void linkLast(int element) {
        Lnode l = last;
        Lnode newNode = new Lnode(l, element, null);
        last=newNode;
        if(l==null){
            first=newNode;
        }else{
            l.next=newNode;
        }
    }

    void print(Lnode first){
        Lnode item = first;
        while(item.next!=null){
            System.out.print(" "+first.element );
            item=item.next;
        }
    }



}
