package com.LLD.SOLID.OpenClose.GoodCode;

public class WhatsApp implements Message{
    @Override
    public void sendMessage() {
        System.out.println("SendingMessageViaWA");
        //Login to send Message
    }
}
