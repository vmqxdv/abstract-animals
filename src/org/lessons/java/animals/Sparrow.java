package org.lessons.java.animals;

public class Sparrow extends AbstractAnimal implements IFly {

  private String featherColor;
  private boolean canFly;

  public Sparrow() {
    super();
    this.featherColor = null;
    this.canFly = false;
  }

  public Sparrow(String name, int age, int sex, float weight, float height, String featherColor, boolean canFly) {
    super(name, age, sex, weight, height);
    this.featherColor = featherColor;
    this.canFly = canFly;
  }

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

  // -- Implemented
  @Override
  public void fly() {
    System.out.printf("%s sta volando!", this.getName());
  }
}
