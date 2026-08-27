public class DataTypeDefaults {

    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    String stringValue;

    public static void main(String[] args) {

        DataTypeDefaults obj = new DataTypeDefaults();

        System.out.println("byte: " + obj.byteValue);
        System.out.println("short: " + obj.shortValue);
        System.out.println("int: " + obj.intValue);
        System.out.println("long: " + obj.longValue);

        System.out.println("float: " + obj.floatValue);
        System.out.println("double: " + obj.doubleValue);

        System.out.println("char: [" + obj.charValue + "]");
        System.out.println("boolean: " + obj.booleanValue);

        System.out.println("String: " + obj.stringValue);
    }
}