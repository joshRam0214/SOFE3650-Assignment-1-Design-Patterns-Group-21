import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ProductB implements Product{
    String name;
    double price;
    public ProductB(){
        this.name = "B";
    }
    @Override
    public void setPrice() {
        try{
            File textReader = new File("src/productTypes.txt");
            Scanner scan = new Scanner(textReader);

            while (scan.hasNextLine()){
                if (scan.nextLine().equalsIgnoreCase("B")){
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
