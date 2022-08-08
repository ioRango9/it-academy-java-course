package by.it_academy.lesson12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        while (true) {
            try {
                list.add(scanner.nextInt());
            } catch (InputMismatchException e) {
                if (scanner.nextLine().equalsIgnoreCase("end")) {
                    break;
                }
                System.out.println("  is not number");
            }
        }
        try (Writer writer = new FileWriter("CubeNumbers.txt")) {
            for (int iterate : list) {
                writer.write(Math.pow(iterate, 3) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}