package W1_EngineeringConcepts.Module_2_DataStructuresAndAlgorithms.ECommercePlatformSearchFunction;

import java.util.*;

public class SearchUtil {
    /*
    Linear Search :
            1. Start from the first element (index 0).
            2. Repeat until the end of the array:
                a. If current element == x:
                    → Return the index (or element found).
            3. If loop ends without finding x:
                → Return -1 (or "not found" or "null").
     Time Complexity : O(N) here, N=Size of array
     */
    public static Product linearSearch(Product[] products,String productName){
        for(Product prod : products){
            if(prod.productName.equalsIgnoreCase(productName)){
                return prod;
            }
        }
        return null;
    }

    /*
    Binary Search :
            (Requires array to be sorted, so sort the array before performing these steps)
            1. Set low = 0, high = length of array - 1.
            2. While low <= high:
               a. Find mid = (low + high) / 2
               b. If arr[mid] == x:
                    → Return mid (element found)
               c. Else if x < arr[mid]:
                    → Set high = mid - 1 (search left half)
               d. Else:
                    → Set low = mid + 1 (search right half)
            3. If loop ends without finding x:
               → Return -1 (or "not found").
    Time Complexity : O(logN) here, N=Size of array
     */
    public static Product binarySearch(Product[] products,String productName){
        Arrays.sort(products,Comparator.comparing(p->p.productName.toLowerCase()));
        int low=0,high= products.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int cmp = products[mid].productName.compareToIgnoreCase(productName);
            if(cmp==0) return products[mid];
            else if(cmp<0) low=mid+1;
            else high=mid-1;
        }
        return null;
    }
}
