package com.vardhan.programming;

public class MessageWriter {

    private IMessageProducer iMessageProducer;

    public void writeMessage(String message){
        iMessageProducer = new HTMLMessageProducer();
        System.out.println(iMessageProducer.formatMessage(message));
    }

    public void setiMessageProducer(IMessageProducer iMessageProducer) {
        this.iMessageProducer = iMessageProducer;
    }
}
