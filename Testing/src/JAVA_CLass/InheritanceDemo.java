package JAVA_CLass;
public class InheritanceDemo {

    // Parent method
    void m11() {
        System.out.println("Parent method m11");
    }
}

// Child class in same file
class Child extends InheritanceDemo {

    void m2() {
        System.out.println("Child method m2");
    }

    public static void main(String[] args) {

        Child obj = new Child();

        obj.m11(); // inherited method
        obj.m2();  // child method
    }
}
