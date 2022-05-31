package Lesson4;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[] {5, 5, 1, 3, 6};
        System.out.printf("%d, %d, %d, %d, %d\n", array[0], array[1], array[2], array[3], array[4]);
        if (array[0] == 5) System.out.println("*****");
        if (array[1] == 5) System.out.println("*****");
        if (array[2] == 1) System.out.println("*");
        if (array[3] == 3) System.out.println("***");
        if (array[4] == 6) System.out.println("******");
        else System.out.println("Mistake");
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            j += array[i];
        }
        System.out.println("Sum of the numbers int the array = " + j);
    }
}
