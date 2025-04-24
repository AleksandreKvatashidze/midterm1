package aleksandre_kvatashidze_1.midterm1.t3;

import java.util.List;

/**
 * The Main class is the entry point for running the sports event management system.
 */
public class Main {
    public static void main(String[] args) {
        // Sample event creation
        Event event = new Event("Championship Tournament", "2025-06-15");

        Team team1 = new Team("Eagles");
        team1.addParticipant(new Participant("John Doe", "Forward"));

        Team team2 = new Team("Sharks");
        team2.addParticipant(new Participant("Jane Smith", "Goalkeeper"));

        event.addTeam(team1);
        event.addTeam(team2);

        // Sample match scheduling
        Match match = new Match(team1, team2, "2025-06-16");

        // Sample result recording
        Results result = new Results(match, "Sharks won 3-1");
    }
}

