package com.vardhan.programming;

public class HTMLMessageProducer implements  IMessageProducer{
    @Override
    public String formatMessage(String message) {
        return "<html><head><body>"+message+"</body></head></html>";
    }
}