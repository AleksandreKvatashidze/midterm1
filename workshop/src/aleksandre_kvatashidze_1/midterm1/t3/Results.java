package aleksandre_kvatashidze_1.midterm1.t3;

/**
 * The Results class is used to track the results of matches in the event.
 */
public class Results {
    private Match match;
    private String result;

    public Results(Match match, String result) {
        this.match = match;
        this.result = result;
    }

    // Getters and Setters

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
