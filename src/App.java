import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

public class App {
    // TO RUN JAVA USE F5
    // static always for main and void cause the function main does not return anything
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
        //// if you don't dot arraytostring and just put numbers you are gonna see the adress of the memorie that reference to the array

       
        
       

    }
}
 