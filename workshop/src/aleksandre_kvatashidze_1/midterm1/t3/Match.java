package aleksandre_kvatashidze_1.midterm1.t3;

/**
 * The Match class represents a match scheduled during the sports event.
 */
public class Match {
    private Team team1;
    private Team team2;
    private String matchDate;

    public Match(Team team1, Team team2, String matchDate) {
        this.team1 = team1;
        this.team2 = team2;
        this.matchDate = matchDate;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }
}
