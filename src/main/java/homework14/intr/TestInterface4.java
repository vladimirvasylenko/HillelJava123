package homework14.intr;

public interface TestInterface4 {
    default void saySome() {
        System.out.println("Hello World");
    }

    static void testStatic() {
        System.out.println("test static method");
    }

    int speed(Integer a, Integer b);



}
