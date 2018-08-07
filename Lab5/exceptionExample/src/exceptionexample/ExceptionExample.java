/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author selimtoker
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Person[] persons = new Person[5];
        BufferedReader br;
        br = null;

    try {

        String sCurrentLine;
        br = new BufferedReader(new FileReader("person.txt"));

        int i=0;
        while ((sCurrentLine = br.readLine()) != null) {
            String[] column=sCurrentLine.split("\\s");
            //for the first line it'll print
            System.out.println(i);
            
            System.out.println("name = " + column[0]);
            System.out.println("surname = " + column[1]); 
            System.out.println("salary = " + column[2]);  
            System.out.println("age = " + column[3]);
            
            System.out.println("Person added to array.");
            persons[i] = new Person(column[0],column[1],Integer.parseInt(column[2]),Integer.parseInt(column[3]));
            
            System.out.println(persons[i]);
            i++;
            
        }

    } 
    catch (FileNotFoundException e) {
        System.out.println(e);
    }
    catch (IOException e) {
        System.out.println(e);
    }
    finally{
        br.close();
    }
     
    }  
}
