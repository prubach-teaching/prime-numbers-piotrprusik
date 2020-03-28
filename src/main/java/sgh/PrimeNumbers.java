package sgh;

public class PrimeNumbers {

    public static void primes(int n)
    {

        int count = 0;

                for (int i = 2; i <= 100000; i++)
                {

                    for (int j = 2; j <= i; j++)
                    {
                        if (count != n-1)
                        {
                            if (j == i)
                            {
                                System.out.print(i + ", ");
                                count=count+1;
                            }
                            if (i % j == 0)
                            {
                                break;
                            }
                        }
                        if (count == n-1)
                        {
                            if (j == i)
                            {
                                System.out.print(i);
                                count=count+1;
                            }
                        }
                            if (i % j == 0)
                            {
                                break;
                            }
                        }
                    if (count == n)
                    {
                        break;
                    }
                }
    }


  public static void main(String[] args) {
        primes(8);
    }

}
