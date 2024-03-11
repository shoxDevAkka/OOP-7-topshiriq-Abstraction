package com.Abstraction.B;

public class Dog extends Animal{

    private String name = "Dog";
    private String sound = "bow-bow";

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
