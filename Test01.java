public class Test01 {
    public static void main(String args[])
    {
        for (int i = 1 ; i < 6 ; i++)
        {
            System.out.print("    ");
            for (int k = 0 ; k < 6-i ; k++ )
            {
                System.out.print(" ");
            }
            for (int j = 0 ; j < i ; j++)
                {
                    System.out.print("* ");
                }
            System.out.println("");
        }
        for(int i = 1 ; i  < 10 ; i++)
        {
            System.out.println("     * * * * * ");
        }
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                System.out.print("  ");
            }
            for(int k=2*i; k<10 ; k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 0 ; i < 5 ; i++ )
        {
            System.out.println("       * * * ");
        }
    }
}
