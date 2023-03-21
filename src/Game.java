public class Game {
    private String name;
    private int players;

    public Game(String name, int players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players;
    }

    public void addPlayers(int count) {
        players += count;
    }
}
