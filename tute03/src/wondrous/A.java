package wondrous;

public class A {
    public void speak() throws Exception {
        throw new Exception("This is message");
    }

    public static void main(String[] args) {
        A a = new A();
        try {
            a.speak();
        } catch (Exception err) {

        }
    }

}
