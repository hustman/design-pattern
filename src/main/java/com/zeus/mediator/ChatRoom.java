package com.zeus.mediator;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        String time = DateFormat.getInstance().format(new Date());
        System.out.println(String.format("[%s][%s]：%s",time,user.getName(),message));
    }
}
