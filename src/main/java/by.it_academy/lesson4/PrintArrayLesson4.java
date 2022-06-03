package by.it_academy.lesson4;

public class PrintArrayLesson4 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 5, 1, 3, 6};
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[array.length - 1]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}