public class InterfaceMain {
    public static void main(String[] args) {

        Printer printer;
        printer = new Print1();
        printer.hi();
        printer.print();

        printer = new Print2();
        printer.print();
    }
}

interface Printer{
    void print();
    default void hi(){
        System.out.println("Hello!");
    }
}

class Print1 implements Printer {

    @Override
    public void print() {
        System.out.println("Printing from 1");
    }
}

class Print2 implements Printer{

    @Override
    public void print() {
        System.out.println("Printing from 2");
    }

}


