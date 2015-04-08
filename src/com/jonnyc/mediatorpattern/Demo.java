package com.jonnyc.mediatorpattern;

public class Demo {

    public static void main(String[] args) {

        User john = new User("John");
        User robert = new User("Robert");

        john.sendMessage("Hey Bob");
        try {
            Thread.sleep(5000);
        }catch(Exception e){}
        robert.sendMessage("Don't call me Bob");
    }
}
