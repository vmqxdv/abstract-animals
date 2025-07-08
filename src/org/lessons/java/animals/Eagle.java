package org.lessons.java.animals;

public class Eagle extends AbstractAnimal implements IFly {

  private double wingspan;
  private int maxFlightAltitude;

  public Eagle() {
    super();
    this.wingspan = 0;
    this.maxFlightAltitude = 0;
  }

  public Eagle(String name, int age, int sex, float weight, float height, double wingspan, int maxFlightAltitude) {
    super(name, age, sex, weight, height);
    this.wingspan = wingspan;
    this.maxFlightAltitude = maxFlightAltitude;
  }

  // -- Wingspan
  public double getWingspan() {
    return this.wingspan;
  }

  public void setWingspan(double wingspan) {
    this.wingspan = wingspan;
  }

  // -- Max Flight Altitude
  public int getMaxFlightAltitude() {
    return this.maxFlightAltitude;
  }

  public void setMaxFlightAltitude(int maxFlightAltitude) {
    this.maxFlightAltitude = maxFlightAltitude;
  }

  // -- Inherited
  @Override
  public void makeSound() {
    System.out.println("Scree!!");
  }

  @Override
  public void eat() {
    System.out.println("*Mangia un topo*");
  }

  // -- Implemented
  @Override
  public void fly() {
    System.out.printf("%s sta volando!", this.getName());
  }
}
