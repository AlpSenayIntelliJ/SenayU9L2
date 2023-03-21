public class GameRunner {
    public static void main(String[] args) {
        Game theGame = new Game("Rock Paper Scissors", 2);
        System.out.println(theGame.getName());
        System.out.println(theGame.getPlayers());
        theGame.addPlayers(1);

        BoardGame boardGame = new BoardGame("Chess", 2, 64);
        System.out.println(boardGame.getName());
        System.out.println(boardGame.getPlayers());
        System.out.println(boardGame.getBoardSize());
        boardGame.changeBoardSize(49);

        VideoGame videoGame = new VideoGame("Minecraft", 1, "Xbox");
        System.out.println(videoGame.getName());
        System.out.println(videoGame.getPlayers());
        System.out.println(videoGame.getConsole());
        videoGame.changeConsole("PS5");
    }
}