import java.awt.Point;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Java works with classes, without isn't working! the Class name need to be the same as the File.java

public class App {
    // TO RUN JAVA USE F5
    // static always for main and void cause the function main does not return anything
    // main() method is required to work
    public static void main(String[] args) throws Exception {

       
        // Primitive Types:
        byte age = 30;
        int viewsCount = 123_456_789;
        long bigNumber = 1123456789L;
        //if you want to use a bigger number like 3_123_456_789 use long instead int and put a L at the end of the number
        float fNumber = 10.223F;
        // same for double or float as default Java sees 12.34 as double so put F at the end 
        char letter = 'E'; //single qute''
        boolean isTrue = true;

        
        // Reference Types: they called reference because they store the refetence to an object in the memorie not the actuall value like the primitive type
        // always use new for a reference type
        Date today = new Date();
        today.getTime();
        // with reference Types you have other member after the . 

        // STRING STUFF
        String frases = "ciao amigo" + " come va"; // string with S string are reference type and immutable
        System.out.println(frases.endsWith("ha")); 
        System.out.println("hey come va? \"bene\"");
        System.out.println("c:\nCiao\\"); // scendi di una linea con n invece t uno spazio
        System.out.println(viewsCount); // to print a primitive type
        //system is a class, out is a field, println(ln is for line) is a method
        System.out.println(today); //shortcut sout
        System.out.println(age);


        // ARRAYS
        int[] numbers = new int[5]; // specify how big is this array (how many index)
        numbers [0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers)); 
        //if you don't define the all index value like now, you're gonna see 0 by default. for boolean is false for string ist empty string 
        
        int[] numbers2 = {1,2,3,4,5};
        System.out.println(numbers2);
        // if you don't dot arraytostring and just put numbers you are gonna see the adress of the memorie that reference to the array
    
       // you can crate a 2 dimantional arrays 
       int [][] numbers3 = new int[2][3];// 2 rows and 3 columns
       numbers3[0][0] = 1;
       System.out.println(Arrays.deepToString(numbers3)); // use deep for multidimentional arrays
       // or you can do it so
       int [][]numbers4 = {{1,2,3}, {4,5,6}};
       System.out.println(Arrays.deepToString(numbers4));

       //CONSTANT const = final, use CAPITAL LETTER TO DEFINE A CONSTANT
       final float PI = 3.14F; // like that is immutable

       // ARITMETICS: for division if is a float you have to do so
       double result = (double)10 / (double)3;
       System.out.println(result);

       // x = 1; x++ = 2; x += 2 add 2 to x
       // you cannot add a string to a integer or float so you use parseInt/parseFloat etc

       // READING INPUT
       Scanner scanner = new Scanner(System.in);
       System.out.print("age: ");
       byte età = scanner.nextByte();
       System.out.println("you are " + età);
       //
       Scanner yourname = new Scanner(System.in);
       System.out.print("Name: "); //using print isnt creating the new line under name but it stay at the same level
       String name = yourname.next(); //using next like this is only storeing one token, if you put you full name only the first one is print out
       System.out.println("you are " + name);
       // use nextLine to printout all the token in the same line
    }
}
