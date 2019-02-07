package mymockitoproject.Misc.Search;

public class BinarySearch {

    public static void main(String[] args) {
        Node parent = new Node(10);
        parent.insert(5);
        parent.insert(15);
        parent.insert(8);

        System.out.println("Printing Inorder: ");parent.printInOrder();
        System.out.println("\n Printing preOrder: ");parent.printPreOrder();
        System.out.println("\n Printing PostOrder");parent.printPostOrder();

        System.out.println("\n Contains 15?: " + parent.contains(15));
        System.out.println("Contains 11>:" + parent.contains(11));

    }

}

class Node{
    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", data=" + data +
                ", right=" + right +

                '}';
    }

    private Node left, right;
    public int data;

    public Node(int data){
        this.data = data;
    }

    //InsertData
    public void insert(int value){
        System.out.println("Inserting " + value);

        if(value<=this.data){

            if(left==null){
                left =new Node(value);
            }else{
                left.insert(value);
            }
        }else{

            if(right == null){
                right = new Node(value);
            }else{
                right.insert(value);
            }
        }
    }


    public boolean contains(int value){
        if(data == value){
            return true;
        }else if(value<data){
            if(left==null){
                return false;
            }else{
                return left.contains(value);
            }
        }else{
                if(right==null){
                    return false;
                }else{
                    return right.contains(value);
                }
        }
    }

    public void printInOrder(){
        if(left!=null){
            left.printInOrder();
        }
        System.out.print(" "+ data);
        if(right!=null){
            right.printInOrder();
        }

    }

    public void printPreOrder(){
        System.out.print(" "+ data);
        if(left!=null){
            left.printInOrder();
        }
        if(right!=null){
            right.printInOrder();
        }

    }

    public void printPostOrder(){

        if(left!=null){
            left.printInOrder();
        }
        if(right!=null){
            right.printInOrder();
        }
        System.out.print(" "+ data);

    }



}
