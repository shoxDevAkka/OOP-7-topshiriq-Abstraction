package com.Abstraction.B;

public class Duck extends Animal{

    private String name = "Duck";
    private String sound = "quack-quack";

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    String sound() {
        return sound;
    }

    @Override
    String getName() {
        return name;
    }
}
