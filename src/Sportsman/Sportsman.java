package Sportsman;

public class Sportsman {
    int competition1;
    int competition2;
    int competition3;
    int competition4;

    Sportsman(int competition1, int competition2, int competition3, int competition4) {
        setCompetition1(competition1);
        setCompetition2(competition2);
        setCompetition3(competition3);
        setCompetition4(competition4);
    }

    public int getCompetition1() {
        return competition1;
    }

    public void setCompetition1(int competition1) {
        if(competition1 >= 50 && competition1 <= 100){
            this.competition1 = competition1;
        }else {
            System.out.println("Invalid points, it should be from 50 to 100");
        }
    }

    public int getCompetition2() {
        return competition2;
    }

    public void setCompetition2(int competition2) {
        if(competition2 >= 50 && competition2 <= 100){
            this.competition2 = competition2;
        }else {
            System.out.println("Invalid points, it should be from 50 to 100");
        }
    }

    public int getCompetition3() {
        return competition3;
    }

    public void setCompetition3(int competition3) {
        if(competition3 >= 50 && competition3 <= 100){
            this.competition3 = competition3;
        }else {
            System.out.println("Invalid points, it should be from 50 to 100");
            System.exit(0);
        }
    }

    public int getCompetition4() {
        return competition4;
    }

    public void setCompetition4(int competition4) {
        if(competition4 >= 50 && competition4 <= 100){
            this.competition4 = competition4;
        }else {
            System.out.println("Invalid points, it should be from 50 to 100");
            System.exit(0);
        }
    }

    public double collectedPoints() {
        return (competition1 + competition2 + competition3 + competition4) / 4.0;
    }
}