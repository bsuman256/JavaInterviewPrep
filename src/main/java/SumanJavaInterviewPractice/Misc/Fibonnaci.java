package mymockitoproject.Misc;

public class Fibonnaci {
    public static void main(String[] args) {
        int num = 10000;

        long startTime = System.nanoTime();

        //for(int i=1;i<=num;i++)
        System.out.println(callFibbonaci(num) + " ");
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(" \n Time taken to calculate Fibonacci number upto 100M without memorization:" + elapsedTime);


    }

    private static int callFibbonaci(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return callFibbonaci(num - 1) + callFibbonaci(num - 2);
        }
    }


    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2); //tail recursion
        }



    }
