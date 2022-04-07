package model;

import org.w3c.dom.ls.LSOutput;

public class Dog {
    public String size, color, breed ;
    public int age;

    // Phím tắt tạo hàm Constructor: Alt + Insert


    public Dog() {
    }

    public Dog(String size, String color, String breed, int age) {
        this.size = size;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public void eat(){
        System.out.println("Breed: " + breed);
    }

    public void size(){
        System.out.println("Size: " + size);
    }

    public void color(){
        System.out.println("Color: " + color);
    }

    public void age(){
        System.out.println("Age: " + age);
    }
}
