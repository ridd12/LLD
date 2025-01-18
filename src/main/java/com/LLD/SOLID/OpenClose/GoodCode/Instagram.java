package com.LLD.SOLID.OpenClose.GoodCode;

public class Instagram implements Message{
    @Override
    public void sendMessage() {
        System.out.println("SendingMessageViaInstagram");
        //Login to send Message through insta
    }
}
