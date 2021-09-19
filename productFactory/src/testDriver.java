public class testDriver {
    public static void main(String[] args) {
       AbstractFactory productFactory = new ProductFactory();
       productFactory.createProduct("A");
       productFactory.createProduct("B");
    }
}
