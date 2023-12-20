import java.util.*;
class Pattern
{
    public static void main(String args[])
    {
       
        int prev_num = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int rows=1;rows<=n;rows++)
        {
            
                int first_number = (rows-1)*10+1;
                prev_num = first_number;
            for(int cols=1;cols<=n;cols++)
            {
               
                  System.out.print(prev_num+" ");
                  prev_num = prev_num+rows;
               
            }
            System.out.println();
        }
    }
}