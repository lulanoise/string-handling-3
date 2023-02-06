package it.develhope.stringhandling;
import java.lang.String;

public class Start {
    public static void main(String[] args) {
        String[] array1 = {" I want ", " to learn ", " how to code! "};

        // the following line of code can be done in a more efficient way with a loop/iteration
        String[] array2 = new String[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i].trim();
        }

        int statement1 = array2[0].compareTo("I want");
        int statement2 = array2[1].compareToIgnoreCase("To learn");

        System.out.println(!(statement1 > statement2));

    }
}




       
