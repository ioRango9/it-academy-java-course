package by.it_academy.lesson4;

public class SumsOfNumbersInArray {

    public static void main(String[] args) {
        int [] array = new int[] {4, 3, 6, 1, 2};
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            j += array[i];
        }
        System.out.println("The sum of the numbers in the array = " + j);
    }
}
