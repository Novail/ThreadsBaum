package thredy.nodes;

public class BiMulOp extends BiNode{
    public BiMulOp(Node node1, Node node2) {
        super(node1, node2);
    }

    @Override
    public int getValue() {
        Pair pair = BiValue();
        return pair.getX() * pair.getY();
    }
}
