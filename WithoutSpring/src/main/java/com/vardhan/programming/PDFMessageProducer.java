package com.vardhan.programming;

public class PDFMessageProducer implements IMessageProducer{
    @Override
    public String formatMessage(String message) {
        return "<PDF> "+message+" </PDF>";
    }
}
