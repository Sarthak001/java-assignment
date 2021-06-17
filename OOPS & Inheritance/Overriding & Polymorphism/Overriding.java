class Fruit {
    String name;
    String taste;
    String size;

    void eat() {
        System.out.println("Eating Fruit");
    }
}

class Apple extends Fruit {
    Apple() {
        name = "Apple";
        taste = "sweet";
    }

    void eat() {
        System.out.println(name + " is " + taste + " in taste.");
    }
}

class Orange extends Fruit {
    Orange() {
        name = "Orange";
        taste = "sweet-tert";
    }

    void eat() {
        System.out.println(name + " is " + taste + " in taste.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Orange orange = new Orange();
        fruit.eat();
        apple.eat();
        orange.eat();

    }
}
