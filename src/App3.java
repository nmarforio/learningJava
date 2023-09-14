import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

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

// Enums is an unmutable value has to be UPPERCASE

class ForEnums{
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

public static void main(String[] args) {
    Level myVar = Level.HIGH;
    
   switch (myVar) {
    case LOW:
        System.out.println("low level");
        break;
   
    case HIGH:
        System.out.println("high level");
        break;
    case MEDIUM:
        System.out.println("medium level");
   }

   // with for loop
        for (Level myLevel : Level.values()){
            System.out.println(myLevel);
        }
}
}

class NewInput{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in); // in for input
        System.out.println("your astrologic sign?");

        String astrolocigSign = myScanner.nextLine(); // nextBoolean(), nextInt(),next... many more type
        System.out.println(astrolocigSign + " is my sign");

        System.out.println("how many country did you visit this year?");
        int countryNumber = myScanner.nextInt();
        System.out.println("I visit " + countryNumber + " this year");
    }
}


class NewTime{ // import java.time.LocalDate
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
}
class FormattingDate{ //import time.format.DateTimeFormatter
    public static void main(String[] args) {
        LocalDateTime beforeFormatting = LocalDateTime.now();
        System.out.println("No formatting: "+beforeFormatting);

        // with ofPattern you can decide how to show the date mm/dd/yy, HH:mm:ss, E(shows the day),mmm,yyyy
        DateTimeFormatter formattingDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String afterFormatting = beforeFormatting.format(formattingDate);
        System.out.println("Yes formatting: "+afterFormatting);

    }
}

class ArraysListEx{ // import ArrayList
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Mercedes");
        System.out.println(cars);

        for(int i = 0; i < cars.size(); i++){
            System.out.println("for loop " + cars.get(i));
        }

        System.out.println(cars.get(0));
        cars.set(0,"Toyota"); // used to modify an element NO ADD!
        System.out.println("after set " +cars); // with this sout i can see the modified array 

        cars.remove(0);
        System.out.println("after remove "+ cars);
        cars.clear();
        System.out.println("after clear " +cars);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(344);
        numbers.add(78);
        numbers.add(213);
        numbers.add(2);

        // import Collections
        Collections.sort(numbers);
        System.out.println(numbers); 
        
    }
}
class HashMapEx{ // import HashMap
        public static void main(String[] args) {

            // the first string is the key, second is the acutal element of the array
            // int Hashmao key and value are actually objects
            // get or remove you use the key 
            HashMap<String, String> capitalCities = new HashMap<String,String>();
            capitalCities.put("england","london");
            capitalCities.put("germany", "berlin");
            capitalCities.put("brasil", "brasilia");
            System.out.println(capitalCities);

            
            // this are forEach loops
            for(String i : capitalCities.keySet()){
                System.out.println("hier the keys " + i);
            }
            for(String i : capitalCities.values()){
                System.out.println("this are the values "+i);
            } 
            
            HashMap<String, Integer> personAge = new HashMap<String, Integer>();
            personAge.put("Alex",22);
            personAge.put("Nicole", 3);
            personAge.put("Franzi",12);

            for (String i : personAge.keySet()){
                System.out.println("name " + i + " age " + personAge.get(i));
            }
        }
        
    }