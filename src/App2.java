import java.util.Scanner;

public class App2 {

    // static means that this method belongs to the class App2 and the method should always be declared outside the main() method 
    // void means no return
    // if you want the return you have to specify the type of data
      static void myMethod(){ // if you have data inside () is called parameters
        String mySchool = "Losone"; // when the method is called and you pass the data is called arguments
        System.out.println(mySchool);
        }

        // you can use the same name for a method if you define 2 DIFFERENT TYPE
        static int addition(int x, int y){
            return x + y;
        }
        static double addition(double x, double y){
            return x + y;
        }

        int x = 3;
        int y = 4;

        public void methodPublicExemple(){
            System.out.println("you need to declered an object to call this method");
        }

        // constructor is a way to give values to parameters previusly just created but not declered here the exemple.
        // CAREFUL cause all the App2() object you create now need the age and name to be declered 
        int personAge;
        String personName;

        public App2(int age, String name){
            personAge = age;
            personName = name;
            // go at the end of the page to see the rest
        }

    public static void main (String[] arg) throws Exception{ 

        int x = 1;
        int y = 2;
        System.out.println(x == y);
        System.out.println(x != y);
        // <= or >= like JS

        // I create a new object to use then the int x and y that i have in my class App2
        App2 intObj = new App2(3,"nothig");
        intObj.x = 566; // I can change the value of x and y because they are not final in App2
        intObj.y = 23586;
        System.out.println(intObj.x);
        System.out.println(intObj.y);

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
        // || is or

        int weatherTemp = 40;
        if(weatherTemp > 30) { // use curly brakets only if you have more then one statment 
        System.out.println("is a Hot day");
        System.out.println("drink lot of water");
        } 
        else if (weatherTemp > 20)
        System.out.println("perfect day");
        else 
        System.out.println("cold day");
        

        int income = 123_000;
        boolean highIncome = (income > 100_000);
        String className = income > 100_000 ? "First" : "Economy";

        // Switch statment 
        String role = "admin"; // you can put also a int as a role and as case use the numbers
        switch (role){
            case "admin":
            System.out.println("you're the admin");
            break;
            case "moderator":
            System.out.println("you are a moderator");
            break;
            default:
            System.out.println("youre a gest");
        } 
        System.out.println("CIAO LEONARDO");

        Scanner scanner2 = new Scanner( System.in); 
        System.out.println("new number ");
        int number =  scanner2.nextInt();

        if(number % 5 == 0)
        System.out.println("fizz");
        else if(number % 3 == 0)
        System.out.println("Buzz");
        else if (number % 5 == 0 && number % 3 == 0)
        System.out.println("fizzBuzz");
        else
        System.out.println(number);
        // most specific statment has to be on the top and the most generic ont he bottom so correct should be fizzbuzz on top 


        // call the method
        myMethod();
        double resultDouble = addition(4.3, 5.9);
        int resultInt = addition(4, 8);
        System.out.println(resultDouble);
        System.out.println(resultInt);

        //recursion is when you call the method inside the method, you do it to give a end to a function 
        int resultOfRecursion = somma(10);
        System.out.println(resultOfRecursion);

        int recursionEndStart = methodRecursionEndStart(3,10);
        System.out.println(recursionEndStart);
        
        // public mehtod calling that work only with objects!!
        App2 publicObjectMethod = new App2(2,"n");
        publicObjectMethod.methodPublicExemple();

        App2 ageAndNameObj = new App2(23, "alex");
        System.out.println(ageAndNameObj.personAge + ageAndNameObj.personName);
    }

    //  another exemple of recursion with a halting condition (end point)
    public static int methodRecursionEndStart(int end , int start){
        if (start < end ){
            return start + methodRecursionEndStart(end, start - 1);
        } else{
            return end; 
        }
    }
    // in this case you see that the function is called inside the function to end with int 0 (is called recursion)
    public static int somma(int k){
        if (k < 0){
            return k + somma(k -1);}
            else{
                return 0;
            }
      
      }
    
}
