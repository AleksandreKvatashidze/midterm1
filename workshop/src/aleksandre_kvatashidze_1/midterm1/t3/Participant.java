package aleksandre_kvatashidze_1.midterm1.t3;

/**
 * The Participant class represents a player participating in a team for a sports event.
 */
public class Participant {
    private String name;
    private String role;

    public Participant(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
