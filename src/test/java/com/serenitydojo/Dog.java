package com.serenitydojo;


public class Dog {

    public String name;

    public String favoriteFood;

    public int age;

    public static String DOG_MAKE_NOISE = "Woof";

    public String favoriteToy;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setfavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getfavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println(DOG_MAKE_NOISE);
    }

    public void feed(String food) {
    }
}
