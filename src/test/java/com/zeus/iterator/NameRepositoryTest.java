package com.zeus.iterator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class NameRepositoryTest {

    @Test
    public void test(){
        NameRepository repository = new NameRepository(5);
        repository.add("One");
        repository.add("Two");
        repository.add("Three");
        repository.add("Four");
        repository.add("Five");

        Iterator<String> iterator = repository.getIterator();
        while(iterator.hashNext()){
            String next = iterator.next();
            System.out.println("Name : " + next);
        }
    }

}