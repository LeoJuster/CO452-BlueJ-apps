import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by Leo Juster
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    private Random randomGenerator;
    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        randomGenerator = new Random();

       
        manager.addProduct(new Product(101, "Nike AirMax 720"));
        manager.addProduct(new Product(102, "Nike Airforce 1"));
        manager.addProduct(new Product(103, "Nike AirMax 90"));
        manager.addProduct(new Product(104, "Nike AirMax 270"));
        manager.addProduct(new Product(105, "Nike AirMax 95"));
        manager.addProduct(new Product(106, "Adidas ZX Boost "));
        manager.addProduct(new Product(107, "Adidas Continental"));
        manager.addProduct(new Product(108, "Adidas Superstar"));
        manager.addProduct(new Product(109, "Adidas Stan Smith"));
        manager.addProduct(new Product(110, "Adidas ZX Flux"));
    }

    /**
     * This method will run the test neccessary to meet
     * All the requiremnts
     */
    public void runDemo()
    {
        manager.printAllProducts();
        demoDeliverProducts();
        manager.printAllProducts();
        demoSellProducts();
        manager.printAllProducts();
    }
    
    /**
     * Where details of products are, the prodcuts is restocked
     * and shown again
     */
    private void demoDeliverProducts()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            quantity = randomGenerator.nextInt(8);
            manager.deliverProduct(id, quantity);
        }
    }
    /**
     * Where details of products are, the prodcuts is restocked
     * and shown again
     */
    private void demoSellProducts()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            quantity = randomGenerator.nextInt(4);
            manager.sellProducts(id, quantity);
        }

}
}
