package org.example;

import java.util.Objects;

public class Human{
    private final String name;
    private final String surname;
    private int age;
    private double height;
    private double weight;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setHeight(double height) {
        if (height < 0 || height > 3) {
            throw new RuntimeException("Height invalid.");
        } else {
            this.height = height;
        }
    }

    public void setWeight(double weight) {
        if (weight < 0 || weight > 400) {
            throw new RuntimeException("Weight invalid.");
        } else {
            this.weight = weight;
        }
    }

    public void setAge(int age) {
        if (age < 0 || age > 125) {
            throw new RuntimeException("Age invalid.");
        } else {
            this.age = age;
        }
    }

    public double bmi() {
        return weight / Math.pow(height, 2);
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Human human)) return false;
//        return Objects.equals(name, human.name);
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = name != null ? name.hashCode() : 0;
//        result = 31 * result + (surname != null ? surname.hashCode() : 0);
//        result = 31 * result + age;
//        temp = Double.doubleToLongBits(height);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(weight);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
}
