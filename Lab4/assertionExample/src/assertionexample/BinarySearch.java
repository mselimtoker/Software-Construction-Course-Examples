/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertionexample;

/**
 *
 * @author selimtoker
 */
public class BinarySearch {
    
    // Returns index of x if it is present in arr[], 
    // else return -1
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        
        int stat=1;
        for(int i=0; i<arr.length; i++){
            if(stat==0){
                break;
            }
            if(arr[i]>arr[i+1]){
               stat=0; 
            }
        }
        
        assert(stat==1): "Array not sorted."; //Array isSorted control.
        
        while (l <= r)
        {
            int m = l + (r-l)/2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was 
        // not present
        return -1;
    }
    
}
