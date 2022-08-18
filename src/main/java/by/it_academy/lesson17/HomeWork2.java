package by.it_academy.lesson17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        Scanner scannerDate = new Scanner(System.in);
        System.out.println("Enter start date: ");
        int startDate = Integer.parseInt(scannerDate.nextLine());
        System.out.println("Enter end date: ");
        int endDate = Integer.parseInt(scannerDate.nextLine());
        LocalDate date1 = LocalDate.of(startDate, 1, 1);
        LocalDate date2 = LocalDate.of(endDate, 12, 31);
        while (!date1.equals(date2)) {
            if (date1.getDayOfWeek().equals(DayOfWeek.FRIDAY) && date1.getDayOfMonth() == 13) {
                System.out.println(date1);
            }
            date1 = date1.plusDays(1);
        }
    }
}
