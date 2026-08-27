public class CastingExpressions {

    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;

        int result = a + b;

        System.out.println("Result: " + result);

        byte result2 = (byte) (a + b);

        System.out.println("After explicit casting: " + result2);
    }
}
//
//byte + byte
//↓
//int
//
//byte result = a + b; will not compile
//byte result = (byte) (a + b); will compile