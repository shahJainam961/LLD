package murph.systemDesign.DesignSystems.SnakeAndLadder;

public class Player {
    private String id;
    private int currentPosition;

    public Player(String id, int currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }

    public String getId() {
        return id;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
    public void setCurrentPosition(int position){
        currentPosition = position;
    }
}
