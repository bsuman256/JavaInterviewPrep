package mymockitoproject.Misc;

public class Apple1 {
    public static void main(String[] args) {
       SomeClass1 c1=new SomeClass1();
       c1.go();
    }
}

class SomeClass1 extends SomeMainClass{

    SomeClass1(){
        System.out.println("This is in Child Class");
    }

    {
        System.out.println("This is Default");
    }
    static{
        System.out.println("This is static block");
    }
    void go(){
        name ="Suman";
        System.out.println("This is a go method" +this.name + " " + super.name);
    }
}

class SomeMainClass{
    String name ="bharath";
    SomeMainClass(){
        System.out.println("This is in Main Class");
    }
}
