package Lecture13.task2;

import java.util.LinkedList;

/*Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам:
добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
объекта этого класса в main методе другого класса.*/
public class AnimalsCollection {

    private LinkedList<String> animalList;

    public AnimalsCollection() {
        animalList = new LinkedList<>();
    }

    public void addAnimal(String animalType){
        animalList.addFirst(animalType);
    }

    public String removeAnimal(){

        if (!animalList.isEmpty()){
            return animalList.removeLast();
        }
        else{
            return null;
        }
    }

    public void printAnimal(){
        System.out.println("List of animals: ");
        for (String animal : animalList) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        AnimalsCollection animalsCollection = new AnimalsCollection();

        animalsCollection.addAnimal("Cat");
        animalsCollection.addAnimal("Dog");
        animalsCollection.addAnimal("Cow");

        animalsCollection.printAnimal();

        String removedAnimal = animalsCollection.removeAnimal();
        if (removedAnimal != null) {
            System.out.println("removed animals: " + removedAnimal);
        } else {
            System.out.println("list is empty, not possible to remove.");
        }

        animalsCollection.printAnimal();

    }
}
