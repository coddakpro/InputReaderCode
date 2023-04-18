package com.example.BuffersAndFileReader;
   import java.util.Scanner;
    public class ReturnNumber{

        int[] digits(int m,int l){
            int[] x = new int[l];
            int i = 0;
            while(m > 0)
            {
                x[i] = m % 10;
                m = m / 10;
                i++;
            }
            return x;
        }
        public static void main(String[] args)
        {
            int counter = 0, n, m;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter any number:");
            n = s.nextInt();
            m = n;
            while(n > 0)
            {
                n =n / 10;
                counter++;
            }
            Digits_Number obj=new Digits_Number();
            int[] a =obj.digits(m, counter);
            System.out.print("Digits:");
            for(int i = a.length-1; i >= 0; i--)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
