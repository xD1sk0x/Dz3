package org.example;

public class Child extends Human implements CanPlayGames {

    // this - обращение к текущему экземпляру класса
    // super - обращение к экземпляру класса от которога наследуемся

    public Child(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void setAge(int age) {
        if (age < 0 || age > 18) {
            throw new RuntimeException("Age invalid.");
        } else {
            super.setAge(age);
        }
    }

    @Override
    public String toString() {
        return "It's child " + super.toString();
    }

    public void playGames(){
        System.out.println("I'm playing...");
    }

    @Override
    public void playGame() {

    }


//    @Override
//    public void playGame() {
//        System.out.println("123");
//    }
}
