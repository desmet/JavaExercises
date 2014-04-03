package Variables.Ex1;

import java.lang.reflect.Field;

public class Foo {
    public double doubleVar;
    public float floatVar;

    public byte byteVar;
    public short shortVar;
    public int intVar;
    public long longVar;
    public boolean booleanVar;
    public char charVar;

    public static int staticIntVar;
    public static final int CONST_INT = 0;

    @Override
    public String toString() {
        return "Foo {" +
                "\n\t doubleVar: " + doubleVar +
                "\n\t floatVar: " + floatVar +
                "\n\t byteVar: " + byteVar +
                "\n\t shortVar: " + shortVar +
                "\n\t intVar: " + intVar +
                "\n\t longVar: " + longVar +
                "\n\t booleanVar: " + booleanVar +
                "\n\t charVar: " + charVar +
                "\n}";
    }
}
