// Sample Input:

// 3
// 5 2 1

// Sample Output:

// 8

// Sample Input:

// 2 

// 1  g

// Sample Output:

// You entered bad data.

import java.util.Scanner;
import java.util.InputMismatchException;

class prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;  

        try {
         
            int length = sc.nextInt();
            int[] name = new int[length]; 

            for (int i = 0; i < length; i++) {
                name[i] = sc.nextInt(); 
                sum += name[i];  
            }

            System.out.println(sum);
        } 
        catch (InputMismatchException e) {
            System.out.println("You entered bad data.");
        }
    }
}
