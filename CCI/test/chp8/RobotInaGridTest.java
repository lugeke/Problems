package chp8;

import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class RobotInaGridTest {

    @Test
    public void findPath1() {

        int[][] grid = {
                {1,1,0,1},
                {1,1,0,1},
                {1,1,0,1},
                {1,1,1,1},
        };

        RobotInaGrid r = new RobotInaGrid(grid);
        Collection<Character> path = r.findPath();

        assertEquals(6, path.size());
    }


    @Test
    public void findPath2() {

        int[][] grid = {
                {1,1,0,1},
                {1,1,0,1},
                {1,1,0,1},
                {1,0,1,1},
        };

        RobotInaGrid r = new RobotInaGrid(grid);
        Collection<Character> path = r.findPath();

        assertEquals(0, path.size());
    }


    @Test
    public void findPath3() {

        int[][] grid = {
                {1,1,0,1},
                {1,1,1,1},
                {1,1,0,1},
                {1,1,0,1},
        };

        RobotInaGrid r = new RobotInaGrid(grid);
        Collection<Character> path = r.findPath();

        assertEquals(6, path.size());
    }
}