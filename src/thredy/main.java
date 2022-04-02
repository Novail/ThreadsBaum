package thredy;

import thredy.nodes.*;

public class main {
    public static void main(String[] args){
        Node node = new BiAddOp(new BiDivOp(new VaNode(4), new UnPowOp(new VaNode(2))), new BiMulOp(new UnCompOp(new VaNode(4)), new VaNode(5)));
        System.out.println(node.getValue());
    }
}
