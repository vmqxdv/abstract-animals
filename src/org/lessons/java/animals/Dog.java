package org.lessons.java.animals;

public class Dog extends Animal {

  private String breed;
  private boolean isTrained;

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

}
