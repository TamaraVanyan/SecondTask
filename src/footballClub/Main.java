package footballClub;

public class Main {
    public static void main(String[] args) {
        FootballPlayer[] players = {
                new FootballPlayer("Mark", "Abrahamyan", "goalkeeper", "Armenian", 9, 25),
                new FootballPlayer("Aram", "Avagyan", "midfielder", "Armenian", 11, 23),
                new FootballPlayer("Vazgen", "Sargsyan", "defender", "Armenian", 4, 28),
                new FootballPlayer("Valod", "Baghdasaryan", "goalkeeper", "Armenian", 1, 32),
                new FootballPlayer("Vaghinak", "Manukyan", "Midfielder", "Armenian", 10, 21),
                new FootballPlayer("Ara", "Sargsyan", "Defender", "Armenian", 2, 26),
                new FootballPlayer("Aram", "Petrosyan", "Forward", "Armenian", 7, 24),
                new FootballPlayer("Karen", "Hovhannisyan", "Midfielder", "Armenian", 8, 27),
                new FootballPlayer("Valod", "Hakobyan", "Defender", "Armenian", 5, 30),
                new FootballPlayer("Gago", "Avetisyan", "Midfielder", "Armenian", 6, 29),
                new FootballPlayer("Tigran", "Torosyan", "Forward", "Armenian", 3, 22)
        };

        FootballClub Goris = new FootballClub("Goris FC", "Armenia", players);

        String playerName = Goris.getPlayers()[0].getName();
        int playerAge = Goris.getPlayers()[0].getAge();
        String playerNationality = Goris.getPlayers()[0].getNationality();
        int playerNumber = Goris.getPlayers()[0].getNumber();
        System.out.println("name: " + playerName + ", age: " + playerAge + ", nationality: " + playerNationality + ", number: " + playerNumber);

        String player1Name = Goris.getPlayers()[9].getName();
        int player1Age = Goris.getPlayers()[9].getAge();
        String player1Nationality = Goris.getPlayers()[9].getNationality();
        int player1Number = Goris.getPlayers()[9].getNumber();
        System.out.println("name: " + player1Name + ", age: " + player1Age + ", nationality: " + player1Nationality + ", number: " + player1Number);

    }
}