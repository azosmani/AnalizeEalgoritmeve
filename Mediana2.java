/* Java programi per gjetjen e   
   e medianes ne nje varg (array)*/

import java.util.*;
public class Mediana2 
{
  
  // Function for calculating median
   public static double findMedian(int a[], int n)
   {
   
   // First we sort the array
      Arrays.sort(a);
   
   // kontrollon rastin cift
      if (n % 2 != 0)
         return (double)a[n / 2];
   
      return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
   }

 
   public static void main(String args[])
   {
      int a[] = { 1, 3, 4, 2, 7, 5, 8, 6};
      int n = a.length;
   
      System.out.println("Vargu i pa renditur eshte: ");
      for (int num : a) {
         System.out.print(num + " ");
      }
      Arrays.sort(a);
      System.out.println("\nVargu i renditur eshte: ");
      for (int num : a) {
         System.out.print(num + " ");
      }
      System.out.println("");
      System.out.println("Mediana = " + findMedian(a, n));
   }
}
 
