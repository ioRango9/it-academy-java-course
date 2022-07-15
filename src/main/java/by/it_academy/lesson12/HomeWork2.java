package by.it_academy.lesson12;

import java.io.*;
import java.util.*;

public class HomeWork2 {


    public static void main(String[] args) throws IOException {
        DateFile homeWork2 = new DateFile();
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        List<DateFile> something = new LinkedList<>();
        Map<String, Integer> mapNumberOfGames = new LinkedHashMap<>();
        Map<String, Integer> mapTeamWins = new LinkedHashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader
                ("it-academy-java-course/src/main/java/data.csv"));
        while (reader.ready()) {
                list.add(reader.readLine());
        }
        for (String value : list) {
            String[] str = value.split("[,. ]");
            list1.addAll(Arrays.asList(str));
        }
//        for (int i = 0; i < list1.size(); i++) {
//         try {
//             something.add(new DateFile(list1.get(i), list1.get(i + 1), list1.get(i + 2), list1.get(i + 3)));
//         } catch (IndexOutOfBoundsException ignored){}
//        }
//        System.out.println(something);


        for (String iterate : list1) {
            try {
                int x = Integer.parseInt(iterate);
                list2.add(String.valueOf(x));
            } catch (NumberFormatException ignored){}
        }
        list1.removeAll(list2);

        for (String s : list1) {
            if (mapNumberOfGames.containsKey(s)) {
                mapNumberOfGames.put(s, mapNumberOfGames.get(s) + 1);
            } else {
                mapNumberOfGames.put(s, 1);
            }
        }

        while (scanner.hasNextLine()) {
            String stringScanner = scanner.nextLine().toUpperCase();
            if (mapNumberOfGames.containsKey(stringScanner)) {
                System.out.println("This team has played a " + mapNumberOfGames.get(stringScanner) + " matches");
            }
            if (stringScanner.equalsIgnoreCase("end")) {
                break;
            }
        }
    }

}



