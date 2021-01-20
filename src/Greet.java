//This is my first Exercise-1 using java application
public class Greet { 

    public static void main(String[] args){
        String[] names = {"Nagamitsu", "Katlego", "Ando"};

        String xxxx = "Nagamitsu";
        String yyyy = "Katlego";
        String zzzz = "Andy";

        greet(xxxx);
        greet(yyyy);
        greet(zzzz);
    }

    public static void greet(String x) {   //printIntegerの略
        String greeting = "Hello!";
        System.out.println(greeting);
        System.out.print("My name is " + x + "." + "Let's be friends.\n");
    }
}

/* ← release here to show other answer.
//This is my another Exercise-1 using java application
public class Greet { 

    public static void main(String[] args){
        String[] names = {"Nagamitsu", "Katlego", "Ando"};
//        for(int i= 0; i<3; i++) {
//            System.out.println(names[i]);
//        }

//        greet(names[0]);
//        greet(names[1]);
//        greet(names[2]);
        for(int j=0; j<3; j++){
            greet(names[j]);
        }

    }

    public static void greet(String x) {   //printIntegerの略
        String greeting = "Hello!";
        System.out.println(greeting);
        System.out.print("My name is " + x + "." + "Let's be friends.\n");
    }

}
*/

