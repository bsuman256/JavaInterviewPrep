package mymockitoproject.Misc;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileCharacterWordsLines {
    public static void main(String[] args) throws Exception {


        BufferedReader bf = new BufferedReader(new FileReader("some.txt"));

        int charCount = 0;

        int wordCount = 0;

        int lineCount = 0;

        String currentLine = bf.readLine();
        while (currentLine != null)
        {
            lineCount++;

            String[] words = currentLine.split(" ");

            wordCount = wordCount + words.length;


            for (String word : words)
            {
                charCount = charCount + word.length();
            }

            currentLine = bf.readLine();
            System.out.println(" --->" +currentLine);
        }

        //Printing charCount, wordCount and lineCount

        System.out.println("Number Of Chars In A File : "+charCount);

        System.out.println("Number Of Words In A File : "+wordCount);

        System.out.println("Number Of Lines In A File : "+lineCount);
        bf.close();
    }

}
