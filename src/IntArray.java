public class IntArray {

    public static void main(String[] args){ //you should add []bracket
        int[] numbers = {4, 7, 0, 3, 9};
/*        System.out.print("Number ");
        System.out.print(numbers[0]);
        System.out.println(".");
        System.out.print("Number ");
        System.out.print(numbers[1]);
        System.out.println(".");
        System.out.print("Number ");
        System.out.print(numbers[2]);
        System.out.println(".");
        System.out.print("Number ");
        System.out.print(numbers[3]);
        System.out.println(".");
        System.out.print("Number ");
        System.out.print(numbers[4]);
        System.out.println(".");
*/
        printInt(numbers[0]);
        printInt(numbers[1]);
        printInt(numbers[2]);
        printInt(numbers[3]);
        printInt(numbers[4]);
    }

    public static void printInt(int x) {   //printIntegerの略
        System.out.print("The Number is ");
        System.out.print(x);
        System.out.println(".");
    }
}

