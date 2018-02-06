public abstract class Player {

    String name;
    Roshambo value;

    abstract Roshambo generateRoshambo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Roshambo getValue() {
        return value;
    }

    public void setValue(Roshambo value) {
        this.value = value;
    }
}
