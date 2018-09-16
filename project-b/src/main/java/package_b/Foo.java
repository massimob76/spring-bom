package package_b;

import project_a.Application;

public class Foo {

    public static void foo(String[] args) {
        System.out.println("Foo: does nothing");
        System.out.println("I can access class: " + Application.class);
    }
}
