package com.LLD.SOLID.DependencyInversion.GoodCode;

import com.LLD.SOLID.DependencyInversion.BadCode.BluetoothKeyBoard;
import com.LLD.SOLID.DependencyInversion.BadCode.KeyBoard;

public class MacBook {
    KeyBoard keyBoard;
    MacBook(KeyBoard keyBoard){
        this.keyBoard=keyBoard;
    }
}

//Now you pass any keyBoard this should work (WiredKeyBoard/BluetoothKeyBoard)
