package mymockitoproject.Misc;

import java.io.*;

public class BasicSingleton {

    private static final BasicSingleton instance = new BasicSingleton();

    private BasicSingleton() {
    }

    public static  BasicSingleton getInstance(){
        return instance;
    }

    private Object readResolve(){

        return instance;
    }

}

class BaseThread implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        }catch (Exception ex){}
        BasicEnum bs = BasicEnum.INSTANCE;
        System.out.println("hascode: " + bs.hashCode());
    }
}

class BasicMain{
    public static void main(String[] args) {
        BasicEnum bs = BasicEnum.INSTANCE;
        System.out.println("hascode: " + bs.hashCode());


        BasicEnum bs1 = BasicEnum.INSTANCE;
        System.out.println("hascode: " + bs1.hashCode());

        BasicEnum bs2 = BasicEnum.INSTANCE;
        System.out.println("hascode: " + bs2.hashCode());

        BasicEnum bs3 = BasicEnum.INSTANCE;
        System.out.println("hascode: " + bs3.hashCode());

        try {
        FileOutputStream fos = new FileOutputStream("myfile.obj");
        ObjectOutputStream ob = new ObjectOutputStream(fos);

        ob.writeObject(bs);
        fos.close();

        FileInputStream fis = new FileInputStream("myfile.obj");
        ObjectInputStream obin = new ObjectInputStream(fis);

            bs3 = (BasicEnum) obin.readObject();
        }catch(Exception ex){}

        System.out.println("----" + bs3.hashCode());

    }
}
