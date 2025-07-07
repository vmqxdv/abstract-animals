package org.lessons.java.animals;

public class Main {
  public static void main(String[] args) {
    Dog dog = new Dog("Dotto", 5, 1, 20.5f, 0.6f, "Labrador", true);
    Sparrow sparrow = new Sparrow("Brontolo", 2, 0, 0.03f, 0.15f, "Brown", true);
    Eagle eagle = new Eagle("Pisolo", 7, 1, 6.0f, 0.8f, 2.1, 3000);
    Dolphin dolphin = new Dolphin("Mammolo", 10, 1, 150.0f, 2.5f, 55.0, 200);

    System.out.println("Cane: ");
    dog.sleep();
    dog.eat();
    dog.makeSound();

    System.out.println("\nPasserotto: ");
    sparrow.sleep();
    sparrow.eat();
    sparrow.makeSound();

    System.out.println("\nAquila: ");
    eagle.sleep();
    eagle.eat();
    eagle.makeSound();

    System.out.println("\nDelfino: ");
    dolphin.sleep();
    dolphin.eat();
    dolphin.makeSound();
  }
}
