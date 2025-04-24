package aleksandre_kvatashidze_1.midterm1.t3;

/**
 * The Team class represents a team in the sports event.
 */
import java.util.ArrayList;
import java.util.List;
public class Team {
    private String teamName;
    private List<Participant> participants;

    public Team(String teamName) {
        this.teamName = teamName;
        this.participants = new ArrayList<>();
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
