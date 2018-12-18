package com.goldman;

public class MagicPotion
{
    private static Integer minimalSteps( String ingredients )
    {
        int n = ingredients.length();
        if (n == 0) {
            return 0;
        }

        Integer dp[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[i], dp[i - 1] + 1);

            if (2*i + 1 < n
                    && ingredients.substring(0, i + 1).equals(ingredients.substring(i + 1, 2*i + 2))) {
                dp[2*i + 1] = dp[ i ] + 1;
            }
        }

        return dp[n - 1];
    }

    public static void main( String[] args )
    {

        if (minimalSteps("ABCDABCE") == 8 && minimalSteps("ABCABCE") == 5 )
        {
            System.out.println( "Pass" );
        }
        else
        {
            System.out.println( "Fail" );
        }


        /*MagicPotion mp = new MagicPotion();

        if ( solution.doTestsPass( ) )
        {
            System.out.println( "All tests passed" );
        }
        else
        {
            System.out.println( "Tests failed" );
        }*/
    }
}
