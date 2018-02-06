public class RockPlayer extends Player {

    @Override
    Roshambo generateRoshambo() {
        super.name = "rockPlayer";
        return Roshambo.ROCK;
    }
}
