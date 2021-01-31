public class Phone {
    String model;
    String brand;
    int price;

    public Phone(String brand , String model, int price) {
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


    void getPrice() {
        System.out.println(price);
    }
}
