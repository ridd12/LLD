package com.LLD.SOLID.OpenClose.GoodCode;

public class MessageSender {
    public static void main(String[] args){
        Message insta=new Instagram();
        insta.sendMessage();

        Message wa=new WhatsApp();
        wa.sendMessage();
    }
}
