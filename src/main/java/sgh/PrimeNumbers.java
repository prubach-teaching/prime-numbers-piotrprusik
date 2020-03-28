package sgh;

public class PrimeNumbers {

    public static void primes(int n) {
        
        
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
    
  public static void main(String[] args) {
        primes(4);
    }

}
