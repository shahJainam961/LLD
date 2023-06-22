package murph.systemDesign.DesignSystems.SnakeAndLadder;

public class Jump {
    private int startPosition;
    private int endPosition;

    public Jump(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }
}
