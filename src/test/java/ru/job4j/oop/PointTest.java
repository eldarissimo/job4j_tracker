package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when555to202020then25Point98() {
        double expected = 25.98;
        Point a = new Point(5, 5, 5);
        Point b = new Point(20, 20, 20);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to222then3Point46() {
        double expected = 3.46;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when312to546then5Point38() {
        double expected = 5.38;
        Point a = new Point(3, 1, 2);
        Point b = new Point(5, 4, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}