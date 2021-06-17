class Animal{
    public void eat(){
        System.out.println("I love to eat");
    }
    public void sleep(){
        System.out.println("I love to sleep");
    }
}

class Bird extends Animal{

    public void eat(){
        System.out.println("I love to eat insects");
    }
    public void sleep(){
        System.out.println("I love to sleep on one leg");
    }

    public void fly(){
        System.out.println("I love to fly");
    }

}

public class Assignment_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();

        animal.eat();
        animal.sleep();
        bird.eat();
        bird.sleep();
        bird.fly();

    }

    
}
