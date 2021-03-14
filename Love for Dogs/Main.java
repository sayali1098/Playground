import java.util.Scanner;
import java.util.regex.*;
class Dog {
String name;
  Float weight;
  int age;
  String color;
  String breed;
  public Dog(String name, Float weight, int age, String color, String breed){
  this.name = name;
    this.weight = weight;
    this.age = age;
    this.color = color;
    this.breed = breed;
  }
}
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    String name = in.next();
    Float weight = in.nextFloat();
    int age = in.nextInt();
    String color = in.next();
    String breed = in.next();
    Dog dog1 = new Dog(name,weight,age,color,breed);
     if((dog1.name.matches("^[A-Za-z]*$")) && (dog1.weight>0) && (dog1.age>0)){
     
      System.out.println("Name of the dog: "+ dog1.name);
      System.out.println("Weight of the dog: "+ dog1.weight);
      System.out.println("Age of the dog: "+ dog1.age);
       System.out.println("Color of the dog: "+ dog1.color);
       System.out.println("Breed of the dog: "+ dog1.breed);
    }
    else
      System.out.println("Invalid Input");
  }
     
    
  }
