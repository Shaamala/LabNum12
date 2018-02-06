public class HumanPlayer extends Player {

    String thrown;

    public String getThrown() {
        return thrown;
    }

    public void setThrown(String thrown) {
        this.thrown = thrown;
    }

    public HumanPlayer() {
        super();

    }

    public HumanPlayer(String thrown) {
        this.thrown = thrown;
    }

    @Override
    Roshambo generateRoshambo() {

        String plyerChoice = null;

        if (plyerChoice ==("R")) {
            return Roshambo.ROCK;
        } else if (plyerChoice ==("P")) {
            return Roshambo.PAPER;
        }
            return Roshambo.SCISSOR;


    }


}
