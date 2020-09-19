
import java.util.Scanner;
import java.math.BigInteger;
import java.lang.System;

public class PascalTriangle
{
	
    	public static BigInteger factorial(long value)
	{
    		if(value < 0)
		{
        		throw new IllegalArgumentException("Value must be positive");
    		}

    		BigInteger result = BigInteger.ONE;
    		for (int i = 2; i <= value; i++) 
		{
        		result = result.multiply(BigInteger.valueOf(i));
    		}

    		return result;
	}
	public BigInteger return_coeff(long power, long pos)
	{
		BigInteger numerator = this.factorial(power);
		
		BigInteger denominator = this.factorial(pos).multiply(this.factorial(power - pos));

		BigInteger result = numerator.divide(denominator);
		return result;
	}

	public void print_triangle(long rows)
	{
		
		BigInteger individual_coeff;
		
		System.out.println();

		int j = 0;
		int k = 1;
		int count = 0;


		for(int i = 0; i < rows; i++)
		{	System.out.print(k + ") ");
			while(j <= count)
			{
				individual_coeff = this.return_coeff(count, j);
				System.out.print(individual_coeff + " ");
				
				++j;
			}
		j = 0;
		k++;

		++count;
		System.out.println();
		}

	}

public static void main(String[] args)
	{
		PascalTriangle triangle = new PascalTriangle();
		Scanner scanner = new Scanner(System.in);
    		System.out.print("Enter number of lines: ");
    		long number = scanner.nextLong();
		triangle.print_triangle(number);
	}
}

/***************Output*******************************
Enter number of lines: 20

1) 1
2) 1 1
3) 1 2 1
4) 1 3 3 1
5) 1 4 6 4 1
6) 1 5 10 10 5 1
7) 1 6 15 20 15 6 1
8) 1 7 21 35 35 21 7 1
9) 1 8 28 56 70 56 28 8 1
10) 1 9 36 84 126 126 84 36 9 1
11) 1 10 45 120 210 252 210 120 45 10 1
12) 1 11 55 165 330 462 462 330 165 55 11 1
13) 1 12 66 220 495 792 924 792 495 220 66 12 1
14) 1 13 78 286 715 1287 1716 1716 1287 715 286 78 13 1
15) 1 14 91 364 1001 2002 3003 3432 3003 2002 1001 364 91 14 1
16) 1 15 105 455 1365 3003 5005 6435 6435 5005 3003 1365 455 105 15 1
17) 1 16 120 560 1820 4368 8008 11440 12870 11440 8008 4368 1820 560 120 16 1
18) 1 17 136 680 2380 6188 12376 19448 24310 24310 19448 12376 6188 2380 680 136
 17 1
19) 1 18 153 816 3060 8568 18564 31824 43758 48620 43758 31824 18564 8568 3060 8
16 153 18 1
20) 1 19 171 969 3876 11628 27132 50388 75582 92378 92378 75582 50388 27132 1162
8 3876 969 171 19 1

**************************************************************/
