public class Node {
    private int x;
    private int y;

    private Node nextRight;
    private Node nextDown;
    private Node nextLeft;
    private Node nextUp;

    public Node() {

    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Node getNextRight() {
        return nextRight;
    }

    public void setNextRight(boolean isWallRight) {
        if(isWallRight) {
            this.nextRight = null;
        } else {
            this.nextRight = new Node(x + 1, y);
        }
    }

    public Node getNextDown() {
        return nextDown;
    }

    public void setNextDown(boolean isWallDown) {
        if(isWallDown) {
            this.nextDown = null;
        } else {
            this.nextDown = new Node(x, y - 1);
        }
    }

    public Node getNextLeft() {
        return nextLeft;
    }

    public void setNextLeft(boolean isWallLeft) {
        if(isWallLeft) {
            this.nextLeft = null;
        } else {
            this.nextLeft = new Node(x - 1, y);
        }
    }

    public Node getNextUp() {
        return nextUp;
    }

    public void setNextUp(boolean isWallUp) {
        if(isWallUp) {
            this.nextUp = null;
        } else {
            this.nextUp = new Node(x, y + 1);
        }
    }
}
