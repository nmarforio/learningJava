import java.util.Scanner;

public class App2 {
    public static void main (String[] arg) throws Exception{
        int x = 1;
        int y = 2;
        System.out.println(x == y);
        System.out.println(x != y);
        // <= or >= like JS

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
    }
}
