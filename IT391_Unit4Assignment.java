//-----Sara Pak ------
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;


public class IT391_Unit4Assignment 
//------------|       Part A : Section 1      |---------
{ /* 
    //create a method called sortAsc to quick sort the array in ascending order              
    public static int[] sortAsc(int[] arr, int elements)
    {
        if(elements < 2) //base case
        {     
            return arr;
        }

        int current_position = 0;   //start of pivot element
        int temp; //a temporary variable for swapping elements

        for(int i=1; i<elements; i++) //Partitioning loop
        {
            if(arr[i] <= arr[0])
            {
                current_position++;
                temp = arr[i];
                arr[i] = arr[current_position];
                arr[current_position] = temp;
            }
        }
            
        temp = arr[0]; 
        arr[0] = arr[current_position]; 
        arr[current_position] = temp; //takes pivot to the right position
        
        int[] left = sortAsc(arr,current_position); //sorts elements to the left of pivot
        
        int[] arr2 = Arrays.copyOfRange(arr, current_position+1, elements); //separates elements right of pivot
        
        int[] right = sortAsc(arr2, elements-current_position-1); //sorts the elements to the right of pivot
        
        int[] final_array = new int[elements]; //final array, merges everything together
        
        for(int i=0; i<current_position; i++)
                  {
                      final_array[i] = left[i]; 
                  }
                  final_array[current_position] = arr[current_position];
                  for(int i=current_position+1; i<elements; i++)
                  {
                      final_array[i] = right[i-current_position-1];
                  }
            
                return final_array;
            
    }
        public static void main(String[] args)
        {
            System.out.println(" ");
            System.out.println("------- | Part A : Section 1  - Quick Sort| -------");
            System.out.println(" ");

            int[] myNumbers = 
            { 
                6501, 
                9503, 
                7557, 
                5535, 
                5601, 
                9001, 
                9888, 
                8801, 
                9767, 
                7815 
            };

            System.out.print("The array unsorted is: [ ");
                for (int i = 0; i < myNumbers.length; i++)
                {
                    System.out.print(myNumbers[i]); 
                    if (i != myNumbers.length)
                    { 
                        System.out.print(", "); 
                    }
                }
                
                System.out.println("]");

                myNumbers = sortAsc(myNumbers, myNumbers.length);

                System.out.print("The array sorted is: [ "); 
                for(int i=0; i<myNumbers.length;i++)
                {   
                    System.out.print(myNumbers[i]);
                    System.out.print(", ");
                }
                
                System.out.print("]");
        }  //end of quickSort driver code...  
              
//------------|       Part A : Section 2      |---------        
    
        public static void main(int [] sort_arr, int len)
        {    
            for (int i=0;i<len-1;++i){
    
                for(int j=0;j<len-i-1; ++j){
    
                    if(sort_arr[j+1]<sort_arr[j]){
    
                        int swap = sort_arr[j];
                        sort_arr[j] = sort_arr[j+1];
                        sort_arr[j+1] = swap;
    
                    }
                }
            }
        
            System.out.println(" ");
            System.out.println("------- | Part A : Section 2 - Bubble Sort| -------");
            System.out.println(" ");

            int [] array = 
            {
                5,
                90,
                35,
                45,
                150,
                3
            };

            System.out.print("The array unsorted is: [ ");
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i]); 
                if (i != array.length)
                { 
                    System.out.print(", "); 
                }
            }
            
            System.out.println("]");
            
            main(array,len);

            System.out.print("The array sorted is: [ "); 
            for(int i = 0; i<len; ++i)                
                {   
                    System.out.print(array[i] + " ");
                    System.out.print(", ");
                }
                
                System.out.print("]");
        
        }
        

} 


class BubbleSort 
{

  // perform the bubble sort
    static void bubbleSort(int array[]) 
    {
        int size = array.length;
    
    // loop to access each array element
    for (int i = 0; i < size - 1; i++)
    
      // loop to compare array elements
      for (int j = 0; j < size - i - 1; j++)

        // compare two adjacent elements
        if (array[j] > array[j + 1]) 
        {

          // swap if elements are not in sorted in order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
    }

   static void main(String args[]) 
  {
    int[] bubbleArray = 
    { 
        5, 
        90, 
        35, 
        45, 
        150, 
        3 
    };
    
    // call method using class name
    BubbleSort.bubbleSort(bubbleArray);

    System.out.println(" ");
    System.out.println("------- | Part A : Section 2 - Bubble Sort| -------");
    System.out.println(" ");
    
    System.out.println("The array unsorted is: [ 5, 90, 35, 45, 150, 3 ] ");
    
    System.out.print("The array sorted is: ");
    System.out.print(Arrays.toString(bubbleArray)); 
}
*/


//------------|       Part A : Section 3      |---------        
    


  int binarySearch(int array[], int element, int low, int high) {

    // Repeat until the pointers low and high meet each other
    while (low <= high) {

      // get index of mid element
      int mid = low + (high - low) / 2;

      // if element to be searched is the mid element
      if (array[mid] == element)
        return mid;

      // if element is less than mid element
      // search only the left side of mid
      if (array[mid] < element)
        low = mid + 1;

      // if element is greater than mid element
      // search only the right side of mid
      else
        high = mid - 1;
    }

    return -1;
  }

  public static void main(String args[]) {

    // create an object of Main class
    Main obj = new Main();

    // create a sorted array
    int[] array = { 3, 4, 5, 6, 7, 8, 9 };
    int n = array.length;

    // get input from user for element to be searched
    Scanner input = new Scanner(System.in);

    System.out.println("Enter element to be searched:");

    // element to be searched
    int element = input.nextInt();
    input.close();

    // call the binary search method
    // pass arguments: array, element, index of first and last element
    int result = obj.binarySearch(array, element, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}

}