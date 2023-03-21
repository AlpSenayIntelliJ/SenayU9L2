public class BoardGame extends Game{
    private int boardSize;

    public BoardGame(String name, int players, int boardSize) {
        super(name, players);
        this.boardSize = boardSize;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void changeBoardSize(int newSize) {
        boardSize = newSize;
    }
}