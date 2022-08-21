/*
 * Fernando Duffoo
 * 7/10/22
 * CSCI 231
 * Project 08
 */

import java.util.*;

class FernandoDuffooProject08
{
    public static void main(String []args)
    {
        int n, j;
        char[][]ht = new char[3][3];
        int []a = new int [9];
        
        var sc = new Scanner(System.in);
        
        System.out.print("Enter an integer representing the state of coins (between 0-511): ");
        n = sc.nextInt();
        
        while(n > 511 || n < 0)
        {
            if(n > 511)
            System.out.println("Error: The number you entered is greater than 511. Please try again.");
            else
            System.out.println("Error: The number you entered is less than 0. Please try again.");
            System.out.println("Enter an integer representing the state of coins (between 0-511): ");
            n = sc.nextInt();
        }
        int i = 0;
        while(n > 0)
        {
            a[i] = n%2;
            n = n/2;
            i++;
        }
        int r = 0, c = 0;
        for(i = 9; i > 0; i--)
        {
            if(a[i-1] == 1)
            ht[r][c] = 'T';
            else
            ht[r][c] = 'H';
            c++;
            if(c == 3)
            {
                r++;
                c = 0;
            }
        }
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            System.out.print(ht[i][j]);
            System.out.println(" ");
        }
    }
}