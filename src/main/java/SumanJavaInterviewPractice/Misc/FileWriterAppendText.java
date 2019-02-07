package mymockitoproject.Misc;

import java.io.*;

public class FileWriterAppendText {

    public static void main(String[] args) throws Exception {

        Reader r1 = new FileReader("abc.txt");

        System.out.println(r1.read());
        BufferedWriter bfw = new BufferedWriter(new FileWriter("some.txt",true));

        PrintWriter pf = new PrintWriter(bfw);

        pf.append("\n Added line by Suman");

        bfw.close();

        System.out.println("Printing Contents ");


        BufferedReader bfr = new BufferedReader(new FileReader("some.txt"));
        String readline = bfr.readLine();
        while(readline!=null){
            String words = readline;
            System.out.println("--> "+ words);
            readline = bfr.readLine();
        }
        bfr.close();
    }
}
