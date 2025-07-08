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
    makeItSwim(dog);

    System.out.println("\n----------------");

    System.out.println("Passerotto: ");
    sparrow.sleep();
    sparrow.eat();
    sparrow.makeSound();
    makeItFly(sparrow);

    System.out.println("\n----------------");

    System.out.println("Aquila: ");
    eagle.sleep();
    eagle.eat();
    eagle.makeSound();
    makeItFly(eagle);

    System.out.println("\n----------------");

    System.out.println("Delfino: ");
    dolphin.sleep();
    dolphin.eat();
    dolphin.makeSound();
    makeItSwim(dolphin);

    System.out.println("\n----------------");
  }

  static void makeItFly(IFly animal) {
    animal.fly();
  }

  static void makeItSwim(ISwim animal) {
    animal.swim();
  }
}
