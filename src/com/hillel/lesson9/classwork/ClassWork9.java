package com.hillel.lesson9.classwork;

public class ClassWork9 {

    public static void main(String[] args) {

        Animal animal = new Animal("myAnimal", 5);

        System.out.println(animal);

        WildAnimal wildAnimal = new WildAnimal("myWildAnimal", 7);

        System.out.println(wildAnimal);

        Cat cat = new Cat("myCat", 10);

        System.out.println(cat);

        Dog dog = new Dog("myDog", 15);

        System.out.println(dog);

//        cat is child of Animal so can be casted
        if (cat instanceof Animal) {
            System.out.println("cat is child of Animal");
            Animal castedCatAnimal = cat;
            castedCatAnimal.getAnimalSound();
        }

//        dog is child of Animal so can be casted
        if (dog instanceof Animal) {
            System.out.println("cat is child of Animal");
            Animal castedDogAnimal = dog;
            dog.getAnimalSound();
        }

//        wildAnimal is child of Animal so can be casted
        if (wildAnimal instanceof Animal) {
            System.out.println("wildAnimal is child of Animal");
            Animal castedWildAnimalToAnimal = wildAnimal;
            castedWildAnimalToAnimal.getAnimalSound();
        }
//        cat is not child of Dog so can not be casted
//        if(cat instanceof Dog){
//            System.out.println("cat is child of Dog");
//        }

//      can not be casted because animal is not child of WildAnimal - ClassCastException is runtime exception
//      WildAnimal myAnimalFromWildAnimal = (WildAnimal) animal;

        // can not be casted because animal is not child of Cat - ClassCastException is runtime exception
//      WildAnimal myAnimalFromWildAnimal = (WildAnimal) animal;
//        Cat animalCat = (Cat) animal;

//      different behavior of sound method (overridden)
        animal.getAnimalSound();
        cat.getAnimalSound();
        dog.getAnimalSound();
        wildAnimal.getAnimalSound();

        boolean isCatChildOfAnimal = cat instanceof Animal;

        boolean isAnimalChildOfWildAnimal = animal instanceof WildAnimal;

//        compilation type exception
//        if (isAnimalChildOfWildAnimal) {
//            WildAnimal myAnimalFromWildAnimal = (WildAnimal) animal;
//        }

//        animalCatCasted has only methods of Animal class
        if (isCatChildOfAnimal) {
            Animal animalCatCasted = cat;
            System.out.println(animalCatCasted);
        }
        // change the age field value only in child object but with parent methods
        cat.setAge(11);

        System.out.println(cat);
        // change the age field value only in child object but with parent methods
        dog.setAge(16);

        System.out.println(dog);

        System.out.println("now parent class Animal");

        System.out.println(animal);

// method belongs only to cat objects
        cat.play();
        cat.play();
        cat.play();
        cat.play();
        cat.play();
    }
}
