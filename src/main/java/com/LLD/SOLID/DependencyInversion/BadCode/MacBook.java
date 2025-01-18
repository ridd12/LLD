package com.LLD.SOLID.DependencyInversion.BadCode;

public class MacBook {
    BluetoothKeyBoard bluetoothKeyBoard;
    MacBook(BluetoothKeyBoard bluetoothKeyBoard){
        this.bluetoothKeyBoard=bluetoothKeyBoard;
    }
}

//But lets say we want a macbook with wiredKeyBoard and pass a wiredKeyBoard instance in constructor so this will fail instead look good code