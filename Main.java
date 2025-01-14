// Java program to rearrange an 
// array in minimum maximum form 
  
public class Main { 
  
    // Prints max at first position, min at second 
    // position second max at third position, second 
    // min at fourth position and so on. 
    public static void rearrange(int arr[], int n) 
    { 
        // initialize index of first minimum and first 
        // maximum element 
        int max_idx = n - 1, min_idx = 0; 
  
        // store maximum element of array 
        int max_elem = arr[n - 1] + 1; 
  
        // traverse array elements 
        for (int i = 0; i < n; i++) { 
            if (i % 2 == 0) { 
                arr[i] += (arr[max_idx] % max_elem) * max_elem; 
                max_idx--; 
            } 
  
            else { 
                arr[i] += (arr[min_idx] % max_elem) * max_elem; 
                min_idx++; 
            } 
        } 
      
      # A for loop can be added for better optimization
        
        for (int i =0 ; i<n; i++)
        {
          arr[i] = arr[i] + 1;
        }
  
        for (int i = 0; i < n; i++) 
            arr[i] = arr[i] / max_elem; 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
        int n = arr.length; 
  
        System.out.println("Original Array"); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
  
        rearrange(arr, n); 
  
        System.out.print("\nModified Array\n"); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
      System.out.println("Max element is "arr[0] + " ");
      System.out.println("Min element is "arr[1] + " ");
    } 
} 
  
