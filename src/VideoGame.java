public class VideoGame extends Game{
    private String console;

    public VideoGame(String name, int players, String console) {
        super(name, players);
        this.console = console;
    }

    public String getConsole() {
        return console;
    }

    public void changeConsole(String newConsole) {
        console = newConsole;
    }
}