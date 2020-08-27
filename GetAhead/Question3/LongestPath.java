public class LongestPath {
    private int currentLongest = 0;

    public int computeLongestPath(Node n) {
        if (n.children.size() < 1) {
            return 1;
        }

        for (Node child : n.children) {
            int thisLength;
            if (child.value == n.value + 1) {
                thisLength = computeLongestPath(child) + 1;

            } else {
                thisLength = computeLongestPath(child);
            }
            if (thisLength > currentLongest) {
                currentLongest = thisLength;
            }
        }
        return currentLongest;
    }
}