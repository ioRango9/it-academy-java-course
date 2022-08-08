package by.it_academy.lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) throws IOException {
        List<String> lines = new LinkedList<>();
        Map<String, Integer> teamToWins = new LinkedHashMap<>();
        Map<String, Integer> teamToLoses = new LinkedHashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/java/by/it_academy/lesson12/data.csv"));
        while (reader.ready()) {
            lines.add(reader.readLine());
        }
        for (String line : lines) {
            String[] parts = line.split("[,. ]");
            String firstTeam = parts[0];
            String secondTeam = parts[1];
            int firstTeamScore = Integer.parseInt(parts[2]);
            int secondTeamScore = Integer.parseInt(parts[3]);

            if (firstTeamScore > secondTeamScore) {
                teamToWins.compute(firstTeam, (team, score) -> Objects.requireNonNullElse(score, 0) + 1);
                teamToLoses.compute(secondTeam, (team, score) -> Objects.requireNonNullElse(score, 0) + 1);
            } else {
                teamToLoses.compute(firstTeam, (team, score) -> Objects.requireNonNullElse(score, 0) + 1);
                teamToWins.compute(secondTeam, (team, score) -> Objects.requireNonNullElse(score, 0) + 1);
            }
        }

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (teamToWins.containsKey(line) || teamToLoses.containsKey(line)) {
                System.out.println("This team won " + teamToWins.getOrDefault(line, 0) + " matches");
                System.out.println("This team lost " + teamToLoses.getOrDefault(line, 0) + " matches");
            }
            if (line.equalsIgnoreCase("end")) {
                break;
            }
        }
    }

}



