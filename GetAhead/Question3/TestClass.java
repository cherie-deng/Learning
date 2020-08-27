import org.junit.Test;

public class TestClass {
    @Test
    public void test01(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        b.addChildren(d);
        a.addChildren(b, c);

        int returnVal = new LongestPath().computeLongestPath(a);
        System.out.println(returnVal);
        assert 2 == returnVal;
    }

    @Test
    public void test02(){
        Node a1 = new Node(5);
        Node a2 = new Node(6);
        Node a3 = new Node(7);
        Node a4 = new Node(8);
        Node a5 = new Node(12);
        Node a6 = new Node(9);
        Node a7 = new Node(15);
        Node a8 = new Node(10);

        a6.addChildren(a7, a8);
        a4.addChildren(a6);
        a3.addChildren(a4, a5);
        a1.addChildren(a2, a3);

        int returnVal = new LongestPath().computeLongestPath(a1);
        System.out.println(returnVal);
        assert 4 == returnVal;
    }

    @Test
    public void test03(){
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        Node a5 = new Node(5);
        Node a6 = new Node(6);

        a2.addChildren(a6);
        a3.addChildren(a4, a5);
        a1.addChildren(a2, a3);

        int returnVal = new LongestPath().computeLongestPath(a1);
        System.out.println(returnVal);
        assert 2 == returnVal;
    }
}
