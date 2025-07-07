package org.lessons.java.animals;

public class Sparrow extends Animal {

  private String featherColor;
  private boolean canFly;

  // -- Feather Color
  public String getFeatherColor() {
    return this.featherColor;
  }

  public void setFeatherColor(String featherColor) {
    this.featherColor = featherColor;
  }

  // -- Can Fly?
  public boolean canFly() {
    return this.canFly;
  }

  public void CanFly(boolean canFly) {
    this.canFly = canFly;
  }

  // -- Inherited
  @Override
  public void makeSound() {
    System.out.println("Chip Chip!");
  }

  @Override
  public void eat() {
    System.out.println("*Mangia semi*");
  }

}
