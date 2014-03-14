package Interfaces.Ex1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Write a class that implements the CharSequence interface found in the java.lang package.
 * Your implementation should return the string backwards. Select one of the sentences from
 * this book to use as the data. Write a small main method to test your class; make sure to
 * call all four methods.
 **/
public class CSimpl implements CharSequence {
    private String s;

    public CSimpl(String sValue) {
        s = sValue;
    }

    public CSimpl() {
        s = "";
    }

    public int length() {
        return s.length();
    }

    public char charAt(int index) {
        if (index < 0 || index > s.length() - 1) throw new IndexOutOfBoundsException();
        else return s.charAt(s.length() - 1 - index);
    }

    public CharSequence subSequence(int start, int end) {
        if (start > s.length() - 1 || end < 0 || start < end) throw new IndexOutOfBoundsException();
        else return reverse(s.subSequence(s.length() - 1 - start, s.length() - 1 - end));
    }

    private String reverse(CharSequence s) {
        throw new NotImplementedException();
    }


    /**Test**/
    public static void main(String... args) {
        System.out.println("qwerty");

    }
}
