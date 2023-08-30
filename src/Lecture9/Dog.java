package Lecture9;

public class Dog extends  Animal {
    private Dog(){

    }
    public static Dog createDog(){
        return new Dog();
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Dog barks : woof-woof!");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Dogs eat meat and they like it!");
        } else {
            System.out.println(" Dog does not like " + food + " at all!");
        }
    }
}
