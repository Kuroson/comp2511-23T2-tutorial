package wondrous;

public class C {
    public void speak() throws RuntimeException { // unchecked exception
        System.out.println("quack");
    }

    public static void main(String[] args) {
        C c = new C();
        c.speak();
    }
}