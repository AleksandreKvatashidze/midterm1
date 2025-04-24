package aleksandre_kvatashidze_1.midterm1.t3;

/**
 * The PlayerStatistics class tracks the performance of individual players during the event.
 */
public class PlayerStatistics {
    private Participant participant;
    private int goalsScored;
    private int assists;
    private int penalties;

    public PlayerStatistics(Participant participant) {
        this.participant = participant;
        this.goalsScored = 0;
        this.assists = 0;
        this.penalties = 0;
    }

    public void recordGoal() {
        goalsScored++;
    }

    public void recordAssist() {
        assists++;
    }

    public void recordPenalty() {
        penalties++;
    }

    // Getters and Setters

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }
}
