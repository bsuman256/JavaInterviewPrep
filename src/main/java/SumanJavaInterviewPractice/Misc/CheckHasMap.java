package mymockitoproject.Misc;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class CheckHasMap {

    public static void main(String[] args) throws Exception {
        Map<String,String> myMap = new HashMap<>();

       myMap.put("banana","banana");
       myMap.put("apple","apple");
       myMap.put("banana","orange");
       myMap.put("pineApple","pineApple");

        System.out.println("Before Printing: ");

        Thread t1 = new newThreadRunner("first");
        Thread t2 = new newThreadRunner("second");
        Thread t3 = new newThreadRunner("Third");
        t1.start();
        t2.start();
        t3.start();

        t3.join();


       for(Map.Entry<String,String> item:myMap.entrySet()){
           System.out.println(item.getKey() +"-->: "+ item.getValue());
       }


    }
}

class newThreadRunner extends Thread{

    String name;

    public newThreadRunner(){
        super();
    }
    public newThreadRunner(String name){
        super(name);
        this.name=name;
    }
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        for(int i=0;i<20;i++){

            if(i==15){
                System.out.println(" Yielding thread:" + Thread.currentThread().getName() );
                Thread.yield();

            }else{
                try {
                    Thread.sleep(1000);
                }catch (Exception ex){}

            }

        }
        System.out.println("Finished Thread" + Thread.currentThread().getName());
        lock.unlock();


    }

}