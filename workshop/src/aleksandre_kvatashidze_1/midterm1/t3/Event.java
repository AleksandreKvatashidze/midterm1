package aleksandre_kvatashidze_1.midterm1.t3;

import java.util.ArrayList;
import java.util.List;

/**
 * The Event class represents a sports event with details such as event name, date, and participating teams.
 */
public class Event {
    private String eventName;
    private String eventDate;
    private List<Team> teams;

    public Event(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
