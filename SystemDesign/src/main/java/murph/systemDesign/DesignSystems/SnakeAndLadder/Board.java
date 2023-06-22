package murph.systemDesign.DesignSystems.SnakeAndLadder;

import java.util.Random;

public class Board {
    private Cell[][] cells;
    public int getBoardSize(){
        return cells.length;
    }
    public Board(int boardSize, int numOfSnakes, int numOfLadders){
        initCells(boardSize);
        addSnakesAndLadders(numOfLadders, numOfSnakes);
    }

    private void initCells(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakesAndLadders(int numOfSnakes, int numOfLadders){
        int boardSize = cells.length;
        while(numOfSnakes!=0){
            int snakeHead = new Random().nextInt(boardSize*boardSize-1);
            int snakeTail = new Random().nextInt(boardSize*boardSize-1);
            if(snakeTail>=snakeHead) continue;

            Cell cell = getCell(snakeHead);
            if(cell.getJump()!=null) continue;

            Jump jump = new Jump(snakeHead, snakeTail);
            cell.setJump(jump);
            numOfSnakes--;
        }
        while(numOfLadders!=0){
            int ladderHead = new Random().nextInt(boardSize*boardSize-1);
            int ladderTail = new Random().nextInt(boardSize*boardSize-1);
            if(ladderTail<=ladderHead) continue;

            Cell cell = getCell(ladderHead);
            if(cell.getJump()!=null) continue;

            Jump jump = new Jump(ladderHead, ladderTail);
            cell.setJump(jump);
            numOfLadders--;
        }
    }

    public Cell getCell(int num){
        int boardSize = cells.length;
        int r = num/boardSize;
        int c = num%boardSize;
        return cells[r][c];
    }
}
