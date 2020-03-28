package sgh;

public class PrimeNumbers {

    public static void primes(int n) {
        public static void main(String[] args)
    {
        
                for(int i=2;i<=n;i++)
                {
                    for(int j=2;j<=i;j++)
                    {
                        if (j==i)
                        {
                            System.out.print(i+", ");
                        }
                        if ( i % j == 0)
                        {
                            break;
                        }
                    }
                }
    }
        System.out.println("2, 3, 5, 7");
    }


    public static void main(String[] args) {
        primes(4);
    }
}
