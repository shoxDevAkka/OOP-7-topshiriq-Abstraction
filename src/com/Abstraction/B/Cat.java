package com.Abstraction.B;

public class Cat extends Animal{

    private String name = "Cat";
    private String sound = "meow-meow";

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
