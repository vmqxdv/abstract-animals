package org.lessons.java.animals;

public class Dolphin extends Animal {

  private double swimSpeed;
  private int maxDiveDepth;

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
}
