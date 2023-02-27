package footballClub;

public class FootballClub {
    private String clubName;
    private String country;
    private static FootballPlayer[] players;

    public FootballClub(String clubName, String country, FootballPlayer[] players) {
        this.clubName = clubName;
        this.country = country;
        this.players = players;
    }

    public String getClubName() {
        return clubName;
    }

    public String getCountry() {
        return country;
    }

    public static FootballPlayer[] getPlayers() {

        return players;
    }
}