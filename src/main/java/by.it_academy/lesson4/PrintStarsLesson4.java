package by.it_academy.lesson4;

public class PrintStarsLesson4 {

    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 3, 2, 6};
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            while (j < array[i]) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
}