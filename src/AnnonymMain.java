public class AnnonymMain {
    public static void main(String[] args) {

         Car bmw = new Car() {
             @Override
             public void model() {
                 System.out.println("BMW E500");
             }
         };

         bmw.model();
         Car car;
         car = new Mersedec();
         car.model();

    }
}

interface Car{
    void model();
}

class Mersedec implements Car{

    @Override
    public void model() {
        System.out.println("Mersedec G class AMG Pack");
    }
}
