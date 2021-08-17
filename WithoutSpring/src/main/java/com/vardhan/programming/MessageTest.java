package com.vardhan.programming;

public class MessageTest {
    public static void main(String[] args) {
        MessageWriter messageWriter = new MessageWriter();

        messageWriter.setiMessageProducer(new PDFMessageProducer());
        messageWriter.writeMessage("Welcome to Spring");
    }
}
