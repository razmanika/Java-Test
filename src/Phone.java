public class Phone {
    String model;
    String brand;
    int price;

    public Phone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void getBrand() {
        System.out.println(brand);
    }


    void getModel() {
        System.out.println(model);
    }


    int getPrice() {
        return price;
    }

    void certificate(int result) {
        System.out.println(result+" = Int");
    }

    void certificate(double result) {
        System.out.println(result +" = Double");
    }
    void certificate(int result, int b) {
        System.out.println(result + b);
    }
}

