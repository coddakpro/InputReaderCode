package DietelTenAndMyLoops;

import java.util.Scanner;

public class SentinelVAlue {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
      String str = input.nextLine();
      char[] ch = str.toCharArray();
        System.out.print("The revert word is: ");
        int j = str.length();
        for (int i = j; i < 1; --i){
            System.out.print(ch[i - 1]);
        }

    }
}
