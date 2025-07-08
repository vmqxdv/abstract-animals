package org.lessons.java.animals;

public class Dog extends AbstractAnimal implements ISwim {

  private String breed;
  private boolean isTrained;

  public Dog() {
    super();
    this.breed = null;
    this.isTrained = false;
  }

  public Dog(String name, int age, int sex, float weight, float height, String breed, boolean isTrained) {
    super(name, age, sex, weight, height);
    this.breed = breed;
    this.isTrained = isTrained;
  }

  // -- Breed
  public String getBreed() {
    return this.breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  // -- Is Trained?
  public boolean isTrained() {
    return this.isTrained;
  }

  public void isTrained(boolean isTrained) {
    this.isTrained = isTrained;
  }

  // -- Inherited
  @Override
  public void makeSound() {
    System.out.println("Woof Woof!!");
  }

  @Override
  public void eat() {
    System.out.println("*Mangia carne*");
  }

  // -- Implemented
  @Override
  public void swim() {
    System.out.printf("%s sta nuotando!", this.getName());
  }

}
