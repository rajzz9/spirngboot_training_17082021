package com.vardhan.programming;

public class TextMessageProducer implements  IMessageProducer{
    @Override
    public String formatMessage(String message) {
        return "Hello "+ message + " !";
    }
}
