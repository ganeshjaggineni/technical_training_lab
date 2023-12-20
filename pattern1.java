class Pattern
{
    public static void main(String args[])
    {
        int n = 5;
        int even_first_num = 0;
        int odd_first_num = 0;
        for(int rows = 1;rows<=n;rows++)
        {
           
                    even_first_num = rows;
                    odd_first_num = n+rows-1;
                if(rows%2 != 0)
                {
                     for(int cols=1;cols<=n;cols++)
                    {
                        System.out.print(odd_first_num);
                        odd_first_num--;
                    }
                    System.out.println();
                }
                else if(rows %2 ==0)
                {
                     for(int cols=1;cols<=n;cols++)
                    {
                            System.out.print(even_first_num);
                            even_first_num++;
                    }
                    System.out.println();
                }
        }
            
        
    }
}