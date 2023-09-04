package Lecture9;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = Dog.createDog();
        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();

        dog.voice();
        dog.eat("Meat");

        tiger.voice();
        tiger.eat("Meat");

        rabbit.voice();
        rabbit.eat("Grass");

    }
}
