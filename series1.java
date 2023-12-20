import java.util.*;
class Series
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        
        int temp_num = 1;
        int pos = 0;
        System.out.print(1+" ");
        for(int i=2;i<=7;i++)
        {
            temp_num = temp_num*2+pos++;
            System.out.print(temp_num+" ");
        }
    }
}