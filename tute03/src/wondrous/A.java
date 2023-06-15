package wondrous;

import java.io.IOException;

public class A {
    public void speak() throws Exception {
        throw new Exception("Hello error");
    }

    public static void main(String[] args) throws Exception {
        A a = new A();
        a.speak();

    }
}
