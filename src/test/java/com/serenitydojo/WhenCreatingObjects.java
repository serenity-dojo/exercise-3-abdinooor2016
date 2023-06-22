package com.serenitydojo;

import com.serenitydojo.Dog;
import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog() {
        String name = "Fido";
        String favoriteFood = "Bone";
        int age = 5;

        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.setfavoriteFood("Bone");
        System.out.println(fido.getfavoriteFood());

        fido.setAge(5);
        System.out.println(fido.getAge());
    }

}
