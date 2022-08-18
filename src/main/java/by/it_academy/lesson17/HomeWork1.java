package by.it_academy.lesson17;

import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) throws IOException {
        List<String> listDateFormat = List.of("yyyy-MM-dd", "yyyyMMdd", "dd MM yyyy", "dd/MM/yyyy");
        Scanner scannerDate = new Scanner(System.in);
        System.out.println("Enter date: ");
        String date = scannerDate.nextLine();
        for (String iterateFormat : listDateFormat) {
            LocalDate formatDate = format(DateTimeFormatter.ofPattern(iterateFormat) , date);
            if (formatDate != null) {
                System.out.println(formatDate);
            }
        }
    }


    private static LocalDate format(DateTimeFormatter dTF, String date) {
       try {
           return LocalDate.parse(date, dTF);
       } catch (DateTimeException e) {
           return null;
       }
    }
}
