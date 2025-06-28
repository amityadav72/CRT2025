package CRT2025.Collections.HashMap;

import java.util.*;

public class SortingPlayer {

    static class Player implements Comparable<Player> {
        String name;
        int score;
        int jerseyNumber;

        public Player(int jerseyNumber, int score, String name) {
            this.jerseyNumber = jerseyNumber;
            this.score = score;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "jerseyNumber=" + jerseyNumber +
                    ", score=" + score +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Player other) {
            return Integer.compare(this.jerseyNumber, other.jerseyNumber);
        }
    }

    public static void main(String[] args) {
        Set<Player> treeSetObj = new TreeSet<>();

        treeSetObj.add(new Player(10, 90, "Rohit"));
        treeSetObj.add(new Player(7, 95, "Virat"));
        treeSetObj.add(new Player(18, 90, "Dhoni"));
        treeSetObj.add(new Player(45, 80, "Hardik"));

        for (Player p : treeSetObj) {
            System.out.println(p);
        }
    }
}
