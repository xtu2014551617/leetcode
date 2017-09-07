package me.xtu2014551617.problem146;

import java.util.HashMap;
import java.util.LinkedList;

class LRUCache {

    //存储最近使用到的存储key和value的数组下标
    //(first的值是最久未使用的数组下标，只用来删除和插入操作，无查询操作，所以选择双链表)
    private LinkedList<Integer> recentUsedList;

    // key 存储 key值
    // value 存储 数组下标值
    private HashMap<Integer, Integer> hashMap;

    // keys 存储key值
    private int[] keys;

    // values 存储key值
    private int[] values;

    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        init();
    }

    private void init() {
        values = new int[capacity];
        keys = new int[capacity];
        hashMap = new HashMap<>(capacity * 2);
        recentUsedList = new LinkedList<>();
        //默认按照数组下标的顺序 即0是最久未使用的
        for (int i = 0; i < capacity; i++) {
            recentUsedList.add(i);
        }
    }

    public int get(int key) {
        //获取数组下标 如果有值且keys[index]与key值对应(说明没被覆盖)，
        // 否则说明此key值已无效或者不存在
        Integer index = hashMap.get(key);
        if (index != null && keys[index] == key) {
            updateRecentUsedList(index);  //更新最近使用的列表
            return values[index];
        }
        return -1;
    }

    public void put(int key, int value) {
        //获取数组下标 如果有值且keys[index]与key值对应(说明没被覆盖)，
        // 否则说明此key值已无效或者不存在，需要找位置重新put
        Integer index = hashMap.get(key);
        if (index != null && keys[index] == key) {
            //更新value值和最近使用的列表
            values[index] = value;
            updateRecentUsedList(index);
        } else {
            index = recentUsedList.getFirst();
            updateRecentUsedList(index);
            keys[index] = key;
            values[index] = value;
        }
        hashMap.put(key, index);
    }

    //把最近一次使用的数组下标移动到链表末尾
    private void updateRecentUsedList(int index) {
        recentUsedList.remove(Integer.valueOf(index));
        recentUsedList.add(index);
    }
}
