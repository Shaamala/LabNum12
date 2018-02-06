import java.util.Random;

public class RandomPlayer extends Player {
    private Random rand;
    @Override
    Roshambo generateRoshambo() {
        super.name = "randomPlayer";
        rand = new Random();
        int choice = 1 + rand.nextInt(3);
        switch (choice) {
            case 1:
                return Roshambo.ROCK;
            case 2:
                return Roshambo.PAPER;
        }
        //Case 3:
        return Roshambo.SCISSOR;
    }
}
