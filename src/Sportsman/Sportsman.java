package Sportsman;

public class Sportsman {
    private int[] competitionScores;

    public Sportsman(int... competitionScores) {
        this.competitionScores = competitionScores;
        validateScores();
    }

    public int[] getCompetitionScores() {
        return competitionScores;
    }

    public void setCompetitionScores(int... competitionScores) {
        this.competitionScores = competitionScores;
        validateScores();
    }

    public double collectedPoints() {
        return calculateAveragePoints(competitionScores);
    }

    private void validateScores() {
        for (int i = 0; i < competitionScores.length; i++) {
            int score = competitionScores[i];
            if (score < 50 || score > 100) {
                System.out.println("Invalid score for competition it should be from 50 to 100");
                System.exit(1);
            }
        }
    }

    private double calculateAveragePoints(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / (double) scores.length;
    }

    public int compareAverages(Sportsman other) {
        double avg1 = collectedPoints();
        double avg2 = other.collectedPoints();
        if (avg1 > avg2) {
            System.out.println("Sportsman 1 has a higher average score than Sportsman 2.");
            return 1;
        } else if (avg1 < avg2) {
            System.out.println("Sportsman 2 has a higher average score than Sportsman 1.");
            return -1;
        } else {
            System.out.println("Sportsman 1 and Sportsman 2 have the same average score.");
            return 0;
        }
    }
}