public class SumBytesMethod {

    public static int sumBytes(byte a, byte b) {
//        a = 10;
        return a + b;
    }

    public static int sumBytes(byte a, byte b, byte c) {
        return a + b + c;
    }

    public static void main (String[] args){    //Stringに[]を付けてエラーを消す
        byte x = 5, y = 6;
        int result = sumBytes(x, y);
        System.out.println(x + " + " + y + " = " + result);
    }

}
