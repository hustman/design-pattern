package com.zeus.iterator;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class NameRepository implements Container {
    private String names[];

    //总容量
    private int capacity;
    //当前大小
    private int currentSize = 0;

    public NameRepository(int capacity) {
        if(capacity < 0 ){
            throw new IllegalArgumentException("capacity不能为负数");
        }
        this.capacity = capacity;
        names = new String[capacity];
    }

    public void add(String value){
        if(currentSize < capacity){
            names[currentSize++] = value;
        }
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String>{
        int index;
        @Override
        public boolean hashNext() {
            return index < currentSize;
        }

        @Override
        public String next() {
            return this.hashNext() ? names[index++] : null;
        }
    }
}
