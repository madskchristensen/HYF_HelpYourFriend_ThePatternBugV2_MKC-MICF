// Field klassen har til ansvar at repræsentere et felt i labyrinten.
// Det gør den ved at have indeholde potentielt set 4 vægge samt 1 node.
public class Field {
    private Wall wallUp;
    private Wall wallRight;
    private Wall wallDown;
    private Wall wallLeft;
    private Node node;

    public Field(Wall wallUp, Wall wallRight, Wall wallDown, Wall wallLeft) {
        this.wallUp = wallUp;
        this.wallRight = wallRight;
        this.wallDown = wallDown;
        this.wallLeft = wallLeft;
    }

    public Field(Node node) {
        this.node = node;
    }

    public Field(Wall wallUp, Wall wallRight, Wall wallDown, Wall wallLeft, Node node) {
        this.wallUp = wallUp;
        this.wallRight = wallRight;
        this.wallDown = wallDown;
        this.wallLeft = wallLeft;
        this.node = node;
    }
}
