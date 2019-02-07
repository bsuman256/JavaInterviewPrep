package mymockitoproject.Misc;

public class ImplementLinkedList {
    public static void main(String[] args) {

        Node root =null;
        System.out.println("Creating the Linked List");
        Linked a = new Linked();
        root=a.insert(1,root);
        root=a.insert(2,root);
        root=a.insert(3,root);
        root=a.insert(4,root);

        a.printList(root);


    }

}

class Linked{

    public Node getNode(int value){

        Node n = new Node();
        n.value=value;
        n.next=null;
        return n;
    }

    public Node insert(int value,Node node){
        if(node==null){
            return getNode(value);
        }
        node.next= insert(value, node.next);
        return node;
    }

    public void printList(Node node){
        if(node==null){
            return;
        }
        System.out.print(" "+ node.value + "==>");
        printList(node.next);


    }


}

class Node {
    int value;
    Node next;
}