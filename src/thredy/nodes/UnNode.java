package thredy.nodes;

public abstract class UnNode implements Node {
    Node node;

    UnNode(Node node) {
        this.node = node;
    }

}
