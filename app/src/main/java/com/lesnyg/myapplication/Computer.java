package com.lesnyg.myapplication;

public class Computer {
    int var1 = 0;
    int var2 = 0;

    public void add(int number) {
        var2 = var1 + number;
    }

    public void sub(int number) {
        var2 = var1 - number;
    }

    public void set(int varIndex, int value) {
        if (varIndex == 1) {
            var1 = value;
        } else {
            var2 = value;
        }
    }
}
