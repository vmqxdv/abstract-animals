package org.lessons.java.animals;

public abstract class AbstractAnimal {

  private String name;
  private int age;
  private int sex;
  private float weight;
  private float height;

  public AbstractAnimal() {
    this.name = null;
    this.age = 0;
    this.sex = 0;
    this.weight = 0f;
    this.height = 0f;
  }

  public AbstractAnimal(String name, int age, int sex, float weight, float height) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.weight = weight;
    this.height = height;
  }

  // -- Name
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // -- Age
  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // -- Sex
  public int getSex() {
    return this.sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  // -- Weight
  public float getWeight() {
    return this.weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  // -- Height
  public float getHeight() {
    return this.height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  // -- General Methods
  public void sleep() {
    System.out.println("ZzZz...");
  }

  public abstract void makeSound();

  public abstract void eat();

}
