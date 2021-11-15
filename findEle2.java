import java.io.*;
import java.util.*;
 
public class findEle {
       static void findElement(int[] arr, int n)
       {

              int[] leftMax = new int[n];
              int count = 0;
              int size = 0;
              leftMax[0] = Integer.MIN_VALUE;

              for (int i = 1; i < n; i++)
                   leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
                    
              size = n;
              int rightMin = Integer.MAX_VALUE;
              while(count < n) {
                
              for (int i = size - 1; i >= 0; i--)
              {

                   if(rightMin[i+1] > arr[i+1]) 
                     rightMin[i] = arr[i+1];
                   else rightMin[i] = rightMin[i+1];

                   rightMin = Math.min(rightMin, arr[i]);
              }
                for (int i=0; i < n; i++) {
                  if (leftMax[i] < arr[i] && rightMin[i] > arr[i]) {
                      System.out.println(" " + i);
                      count = count + 1;
                  }
           }
               
       }
       public static void main(String args[])
       {
              int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
              int n = arr.length;
              findElement(arr, n);
       }
}
