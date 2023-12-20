 import java.util.*;
 class Series
 {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int temp = n+1;
         System.out.print(temp+" ");
         for(int i=1;i<n;i++)
         {
             temp = temp*2+i;
             System.out.print(temp+" ");
         }
     }
 }