package mymockitoproject.Misc;

import java.util.Arrays;

public class ImplementStackArray {

    private int[] myArray;
    private int top;
    private int size;

    public ImplementStackArray(int size){
        myArray = new int[size];
        this.top=0;
    }

    public void push(int item){
        System.out.println("Trying to insert: "+ item);
        if(this.top==size()){
            System.out.println("Stack full!");
        }else{
            myArray[top]=item;
            top++;
        }

    }

    public void pop(){
        if(top==0){
            System.out.println("Stack is Empty");
        }else{
            top--;
            System.out.println("Trying to Pop: "+myArray[top]);

        }
    }

    public void peek(){
        System.out.println("PeeK: "+ myArray[top]);
    }

    public int size(){
        return myArray.length;
    }

    public void print(){
        System.out.println(" printing: "+ Arrays.toString(myArray));
    }

    public static void main(String[] args) {

        ImplementStackArray StackCustom = new ImplementStackArray(10);
        StackCustom.pop();
        System.out.println("=================");
        StackCustom.push(10);
        StackCustom.push(30);
        StackCustom.push(50);
        StackCustom.push(40);
        System.out.println("=================");
        StackCustom.pop();
        StackCustom.pop();
        StackCustom.pop();
        System.out.println("=================");


    }




}
