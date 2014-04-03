package Variables.Ex2;

import Variables.Ex1.Foo;

public class FooExtension extends Foo{
    public static void main(String... args) {
        Foo foo = new Foo();
        System.out.println(foo);

        int a;
//        Error:(..., ...) java: variable a might not have been initialized
//        System.out.println(a);

        System.out.println("Class variable (int): " + Foo.staticIntVar);
    }

}
