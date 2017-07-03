package com.zeus.mediator;

import org.junit.Test;


/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class ChatRoomTest {

    @Test
    public void test(){
        User user1 = new User("zhangsan");
        User user2 = new User("lisi");

        user1.showMessage("Hello everyone");
        user2.showMessage("Hello zhangsan");

    }
}