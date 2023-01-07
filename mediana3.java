public class mediana3
{
   public static int mediana(int a, int b, int c) 
   {
      if (a < b) {
         if (b < c) 
            return b;
         if (a < c) 
            return c;
         return a;
      }
      if (a < c) { 
         return a; }
      if (b < c) { 
         return c; }
      return b;
   }
   public static void main(String[]args)
   {
      System.out.println(mediana(2,5,9));
   }
}