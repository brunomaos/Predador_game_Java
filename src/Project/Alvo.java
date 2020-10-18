package Project;

public class Alvo {
    int numberOfEscape = 0;
    int death = 0;

    public int getNumberOfEscape() {
        return numberOfEscape;
    }

    public void setNumberOfEscape(int numberOfEscape) {
        this.numberOfEscape = numberOfEscape;
    }

    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death += death;
    }
    
    
}
