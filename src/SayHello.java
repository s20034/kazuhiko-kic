//This is my first java application
public class SayHello { 

    public static void main(String[] args){
    /*    int nrOfStudent;
        nrOfStudent = 25;   */

        // Decrare a variable
        int nrOfStudent = 25;
        System.out.println(nrOfStudent);

        String greeting = "Hello World";
        // Print the greeting on my screen
        System.out.println(greeting);

        System.out.println("Hello World!");
        /*
        This is a two-lines
        comment.
        */
        System.out.println("My name is itsme!");

        int[] integers = new int[10];
        integers[0] = 50;
        integers[1] = 51;
        integers[2] = 52;
        integers[3] = 53;
        integers[4] = 54;
        integers[5] = 55;
        integers[6] = 56;
        integers[7] = 57;
        integers[8] = 58;
        integers[9] = 59;
        System.out.println(integers[0]);
        System.out.println(integers[1]);
        System.out.println(integers[2]);
        System.out.println(integers[3]);
        System.out.println(integers[4]);
        System.out.println(integers[5]);
        System.out.println(integers[6]);
        System.out.println(integers[7]);
        System.out.println(integers[8]);
        System.out.println(integers[9]);

        String[] greetings = new String[10];
        greetings[0] = "StringHello";
        System.out.println(greetings[0]);

        String[] strings = new String[10];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "This";
        strings[3] = "is";
        strings[4] = "Muhammad";
        strings[5] = "@";
        strings[6] = "Kobe";
        strings[7] = "Institute";
        strings[8] = "of";
        strings[9] = "Computing";
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);
        System.out.println(strings[3]);
        System.out.println(strings[4]);
        System.out.println(strings[5]);
        System.out.println(strings[6]);
        System.out.println(strings[7]);
        System.out.println(strings[8]);
        System.out.println(integers[9]);

        char[] integerss = new char[10];
        integerss[0] = 'a';
        integerss[1] = 'b';
        integerss[2] = 'd';
        integerss[3] = 'e';
        integerss[4] = 'f';
        System.out.println(integerss.length);
        System.out.println(integerss[0]);
        System.out.println(integerss[1]);
        System.out.println(integerss[2]);
        System.out.println(integerss[3]);
        System.out.println(integerss[4]);
        System.out.println(integerss[5]);
        System.out.println(integerss[6]);
        System.out.println(integerss[7]);
        System.out.println(integerss[8]);
        System.out.println(integerss[9]);

        char[] chars = new char[10];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        chars[3] = 'd';
        chars[4] = 'e';
        chars[5] = 'f';
        chars[6] = 'g';
        chars[7] = 'h';
        chars[8] = 'i';
        chars[9] = 'j';
//        chars[10] = 'k';
        System.out.println("Maximum number of array: "+chars.length);
        System.out.println("char.length method used");
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println(chars[3]);
        System.out.println(chars[4]);
        System.out.println(chars[5]);
        System.out.println(chars[6]);
        System.out.println(chars[7]);
        System.out.println(chars[8]);
        System.out.println(chars[9]);
//        System.out.println(chars[10]); Ex2-e


    }
}
