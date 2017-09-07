package me.xtu2014551617.problem146;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class LRUCacheTest {


    private LRUCache lruCache = new LRUCache(2);

    @Test
    public void test() {
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(3, 3);
        assertEquals(lruCache.get(1), -1);
        assertEquals(lruCache.get(2), 3);
        assertEquals(lruCache.get(3), 3);

//        assertEquals(lruCache.get(1), -1);

    }

}