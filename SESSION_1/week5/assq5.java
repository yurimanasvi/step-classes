package SESSION_1.week5;
import java.util.Arrays;

public class assq5 {

    // Overloaded method 1
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    // Overloaded method 2
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    static class Player implements Comparable<Player> {

        private String name;
        private int matchesPlayed;
        private double battingAverage;
        private boolean injured;

        public Player(String name, int matchesPlayed,
                      double battingAverage, boolean injured) {

            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        @Override
        public int compareTo(Player other) {

            return Double.compare(
                other.battingAverage,
                this.battingAverage
            );
        }

        public String getName() {
            return name;
        }
    }

    static String draftAndRank(Player[] players) {

        Player[] draftable = new Player[players.length];
        int count = 0;

        for (int i = 0; i < players.length; i++) {

            if (isDraftable(players[i].matchesPlayed) ||
                isDraftable(players[i].matchesPlayed,
                            players[i].injured)) {

                draftable[count] = players[i];
                count++;
            }
        }

        Player[] finalList = new Player[count];

        for (int i = 0; i < count; i++) {
            finalList[i] = draftable[i];
        }

        Arrays.sort(finalList);

        String result = "";

        for (int i = 0; i < finalList.length; i++) {

            result = result
                    + (i + 1)
                    + ". "
                    + finalList[i].getName();

            if (i < finalList.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}