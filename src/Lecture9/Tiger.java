package Lecture9;

public class Tiger extends Animal{
    @Override
    public void voice() {
        super.voice();
        System.out.println("Tiger roars: ROAR!");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if (food.equalsIgnoreCase("Meat")){
            System.out.println("Tiger likes meat!");
        } else{
            System.out.println("Tigers do not like " + food + " at all");
        }
    }
}
