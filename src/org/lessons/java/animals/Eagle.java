package org.lessons.java.animals;

public class Eagle extends Animal {

  private double wingspan;
  private int maxFlightAltitude;

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
}
