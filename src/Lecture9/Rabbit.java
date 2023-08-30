package Lecture9;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("The rabbit squeaks: squeaks-squeaks!");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if(food.equalsIgnoreCase("Grass")){
            System.out.println("The rabbit loves to eat grass!");
        } else
        {
            System.out.println("Rabbits do not like " + food + " at all!");
        }
    }
}
