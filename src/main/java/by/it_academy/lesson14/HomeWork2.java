package by.it_academy.lesson14;

import java.util.Scanner;

public class HomeWork2 {
   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bound = scanner.nextInt();
        for (int i = 2; i <= bound; i++) {
            if (checkSimple(i))
                System.out.println(i);
        }
    }


    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        if (i <= 3)
            return true;
        if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}

