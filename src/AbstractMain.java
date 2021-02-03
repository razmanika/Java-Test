public class AbstractMain {
    public static void main(String[] args) {

        Cxoveli animal;

        animal = new Cat();
        animal.hi();
        animal.voice();

        animal = new Dog();
        animal.voice();

    }
}

abstract class Cxoveli {
    abstract void voice();

    void hi() {
        System.out.println("Hello");
    }
}

class Cat extends Cxoveli {

    @Override
    void voice() {
        System.out.println("Miawwww");
    }
}

class Dog extends Cxoveli {

    @Override
    void voice() {
        System.out.println("Waf Waf Waf");
    }
}
