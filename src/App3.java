import java.util.Scanner;

//you can create many classes and at the end with F5 you decide wich one to run if is in the same page like 
// in this file I have App3 and Car!!

public class App3 {
    
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    
    public static void main(String[] args) {
        // person is the name of the object 
     App3 person = new App3();
     person.setName("Nicole");
     System.out.println(person.getName());

        // using JAVA API 
     Scanner objInput = new Scanner(System.in);
     System.out.println("Enter userName");

     String userName = objInput.nextLine();
     System.out.println("the user name is "+ userName);

    }
    
}
//inheritence classes 
// if you want avoid the inheritance of the class use final
class Veicolo{
    // if brand was private I couldn't access it 
    protected String brand = "Volvo";
    public void Honk(){
        System.out.println("HONK! HONK!");
    }
}

class Car extends Veicolo{
    private String modelName = "x34";
    public static void main(String[] args) {
        Car myCar = new Car();
        String carBrand= myCar.brand;
        myCar.Honk();
        System.out.println(carBrand + myCar.modelName);
    }
}

// Polymorphism! is used like here when you use the same method but with different outcome for each class
class Animal{
    public void animalSounds(){
    System.out.println("the sound of the animals");
    }
}

class Pig extends Animal{
    public void animalSounds(){
        System.out.println("the Pig does grunch grunch");
    }
}
class Dog extends Animal{
    public void animalSounds(){
        System.out.println("the dog does bau bau");
    }
}
class Main{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Pig myPig = new Pig();
        Dog myDog = new Dog();

        myAnimal.animalSounds();
        myDog.animalSounds();
        myPig.animalSounds();
    }

}


// Class Inner Class
// in this case the inner class can be private or protected 
// if you do static class for the inner you dont need to create the Obj for the outter class 
class Outterclass{
    int x = 3;

    class Innerclass{
    int x =10;
}
}
class Inoutclass{
    public static void main(String[] args) {
        Outterclass outInt = new Outterclass();
        // static would be onyl line 97 
        Outterclass.Innerclass inInt = outInt.new Innerclass();
        System.out.println("out class "+outInt.x + " in class " + inInt.x);

    }
}

// Abstract Class 
abstract class Sleep{
    public abstract void animalSound(); // NO BODY for the abstract method 
    
    public void sleepingSound(){ // regular method with body
        System.out.println("ZZZ");
    }
}

class Pigy extends Sleep { // in the subclass you can define the method that was abstrac in the superclass Sleep
    public void animalSound(){ 
        System.out.println("the pig does wee wee");
    }
}

class SleepMain{
    public static void main(String[] args) {
        Pigy myPigy = new Pigy();
        myPigy.animalSound();
        myPigy.sleepingSound();
    }
}

// interface 
interface Amici{ //all methods with no body that is an interface 
    public void iCallyou();
    public void youCallme();
    public void letBeTogether();
}
interface Solo{
    public void iAmAlone();
}
class Call implements Amici, Solo{ // with the comma you can implement more then one interface at the time!
    public void iCallyou(){
        System.out.println("hey I called you ");
    }
    public void youCallme(){
        System.out.println("hey you called me");
    }
    public void letBeTogether(){
        System.out.println("we went to the park");
    }
    public void iAmAlone(){
        System.out.println("this one is coming from interface Solo");
    }
}
class Maininterface{
    public static void main(String[] args) {
        Call myFriend = new Call();
        myFriend.iCallyou();
        myFriend.youCallme();
        myFriend.letBeTogether();
        myFriend.iAmAlone();
    }
}