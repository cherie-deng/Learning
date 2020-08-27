import java.util.*;

public class Node {
    public final int value;
    Set<Node> children = new HashSet<>();

    public Node(int value){
        this.value = value;
    }

    public void addChildren(Node ... children){
        this.children.addAll(Arrays.asList(children));
    }
}
