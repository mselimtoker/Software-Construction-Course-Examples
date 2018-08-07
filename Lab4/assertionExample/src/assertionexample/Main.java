/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertionexample;
import java.util.Scanner;

/**
 *
 * @author selimtoker
 */
public class Main {
 
    public static void main(String[] args) {
        
        
        BinarySearch ob = new BinarySearch();
        System.out.println("How many number add to array: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        int num = reader.nextInt();
        assert(num>0) : "Array lenght cannot be negative.";
        int[] arr = new int[num];
        
        for(int i=0; i<num; i++){
          int order= i+1;
          System.out.println("Number "+ order + " :");  
          int val = reader.nextInt();
          assert(val>0) : "Array element cannot be negative.";
          arr[i]=val;
        }
        
        System.out.println("what number are you looking for:");
        int x = reader.nextInt();
        int n = arr.length;
        int result = ob.binarySearch(arr,x);
        
        assert(result>=0) : "Element not present";
        //System.out.println("Element not present");
 
        assert(result<0) : "Element found at index " + result;
        //System.out.println("Element found at index " + result);
       
            
    }   
}



