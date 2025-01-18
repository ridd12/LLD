package com.LLD.SOLID.OpenClose.BadCode;

public class Message {
    String message="Hi";

    public Boolean sendViaWhatApp(){
        //logic to send through WA
        return true;
    }

    public Boolean sendViaNormalText(){
        //logic to send through Normal
        return true;
    }

    //Let's say we want to add a functionality which enables us to send message through telegram
    //So in bad code design we have to change the message class which is wrong

}
