public enum Roshambo {
    ROCK("Rock"),PAPER("Paper"),SCISSOR("Scissor");
    private String name;


    Roshambo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

