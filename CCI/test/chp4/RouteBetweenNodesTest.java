package chp4;

import ds.Node;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RouteBetweenNodesTest {

    @Test
    public void isNotConnected() {

        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();
        d.children.add(c);
        a.children.addAll(Arrays.asList(b, c));
        c.children.addAll(Arrays.asList(b, e));

        assertFalse(RouteBetweenNodes.isConnected(a, d));
    }

    @Test
    public void isConnected() {

        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();
        d.children.add(c);
        a.children.addAll(Arrays.asList(b, c));
        c.children.addAll(Arrays.asList(b, e));

        assertTrue(RouteBetweenNodes.isConnected(a, e));
    }
}