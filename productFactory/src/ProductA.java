import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ProductA implements Product{
    String name;
    double price;
    public ProductA(){
        this.name = "A";
    }
    @Override
    public void setPrice() {
        try{
            File textReader = new File("src/productTypes.txt");
            Scanner scan = new Scanner(textReader);

            while (scan.hasNextLine()){
                if (scan.nextLine().equalsIgnoreCase("A")){
                    this.price = scan.nextDouble();
                    System.out.println("Product of name: " + name + " with price: $" + price);
                    break;
                }
            }

        } catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
