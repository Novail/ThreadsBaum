package thredy.nodes;

public class BiDivOp extends BiNode{
    public BiDivOp(Node node1, Node node2) {
        super(node1, node2);
    }

    @Override
    public int getValue() {
        Pair pair = BiValue();
        return pair.getX() / pair.getY();
    }
}
