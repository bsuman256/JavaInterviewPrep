package mymockitoproject.Misc;

public class LambdaExpressions {

    public static void main(String[] args) {
        SampleInf i= n->n*n;
        System.out.println(i.multiply(10));

        SampleInf2 i1 = n-> System.out.println("Value: "+n*100);
        i1.add100(30);

    }

}

interface SampleInf{
     int multiply(int n);
}

interface SampleInf2{
    void add100(int n);
}
