package murph.systemDesign.DesignSystems.SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Deque<Player> players;
    private Dice dice;
    private Player winner;

    public Game(){
        initGame();
    }
    private void initGame(){
        board = new Board(100, 20, 30);
        dice = new Dice(1, 1, 6);
        winner = null;
        addPlayers();
    }
    private void addPlayers(){
        players = new LinkedList<>();
        Player p1 = new Player("p1", 0);
        Player p2 = new Player("p2", 0);
        players.add(p1);
        players.add(p2);
    }
    public void startGame(){
        while(winner==null){
            // Check Players turn
            Player curPlayer = findPlayerTurn();
            System.out.println(curPlayer.getId()+" Turn: Current Position "+ curPlayer.getCurrentPosition());

            int rollPoints = dice.rollDice();
            System.out.println("Dice outcome : " + rollPoints);
            int nextPosition = getNextPosition(curPlayer.getCurrentPosition(), rollPoints);
            System.out.println("Going to " + nextPosition);
            curPlayer.setCurrentPosition(nextPosition);
            if(curPlayer.getCurrentPosition() >= board.getBoardSize()* board.getBoardSize()-1){
                winner = curPlayer;
                break;
            }
            System.out.println("-------------------------------------");
        }
        System.out.println("Winner "+winner.getId());
    }

    private int getNextPosition(int curPosition, int rollPoints){
        int nextPosition = curPosition + rollPoints;
        if(nextPosition >= board.getBoardSize()*board.getBoardSize()-1)
            return nextPosition;
        Cell cell = board.getCell(nextPosition);
        if(cell.getJump()!=null){
            nextPosition = cell.getJump().getEndPosition();
            if(curPosition+rollPoints>nextPosition)
                System.out.println("Snake");
            else System.out.println("Ladder");
        }
        return nextPosition;
    }

    private Player findPlayerTurn(){
        Player curPlayer = players.removeFirst();
        players.addLast(curPlayer);
        return curPlayer;
    }

}
