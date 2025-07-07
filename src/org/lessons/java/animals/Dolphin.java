package org.lessons.java.animals;

public class Dolphin extends Animal implements Swim {

  private double swimSpeed;
  private int maxDiveDepth;

  public Dolphin() {
    super();
    this.swimSpeed = 0;
    this.maxDiveDepth = 0;
  }

  public Dolphin(String name, int age, int sex, float weight, float height, double swimSpeed, int maxDiveDepth) {
    super(name, age, sex, weight, height);
    this.swimSpeed = swimSpeed;
    this.maxDiveDepth = maxDiveDepth;
  }

  // -- Swim Speed
  public double getSwimSpeed() {
    return this.swimSpeed;
  }

  public void setSwimSpeed(double swimSpeed) {
    this.swimSpeed = swimSpeed;
  }

  // -- Max Dive Depth
  public int getMaxDiveDepth() {
    return this.maxDiveDepth;
  }

  public void setMaxDiveDepth(int maxDiveDepth) {
    this.maxDiveDepth = maxDiveDepth;
  }

  // -- Inherited
  @Override
  public void makeSound() {
    System.out.println("Screeeee ek ek ek!");
  }

  @Override
  public void eat() {
    System.out.println("*Mangia un pesce*");
  }

  // -- Implemented
  @Override
  public void swim() {
    System.out.printf("%s sta nuotando!", this.getName());
  }
}
