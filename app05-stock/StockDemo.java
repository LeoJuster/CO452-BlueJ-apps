/**
 * Demonstrate the StockManager and Product classes.
 * 
 * 
 * @author Leo Juster
 * @version (a version number or a date)
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * This is the constructor ans lists 10 products.
     *
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(0, "Nike Air Max 720"));
        manager.addProduct(new Product(1,  "Nike Air Max 270"));
        manager.addProduct(new Product(2,  "Nike Air Force 1"));
        manager.addProduct(new Product(3, "Nike Vapormax"));
        manager.addProduct(new Product(4, "Nike Air Max 90"));
        manager.addProduct(new Product(5, "Nike Air Max 95"));
        manager.addProduct(new Product(6, "Adidas ZX Boost"));
        manager.addProduct(new Product(7, "Adidas Continental"));
        manager.addProduct(new Product(8, "Adidas Superstar"));
        manager.addProduct(new Product(9, "Adidas ZX Flux"));
    }
    
    /**
     * This method will run all the tests 
     */
    public void runDemo()
    {
       demoDeliverProduct();
       sellProduct(0);
       sellProduct(0);
       sellProduct(1);
       sellProduct(0);
       sellProduct(3);
       sellProduct(3);
       sellProduct(5);
       sellProduct(7);
       sellProduct(2);
       sellProduct(7);
    } 
    
    
    public void demoDeliverProduct()
    {
      manager.delivery(0, 1);
      manager.delivery(1, 3);
      manager.delivery(2, 5);
      manager.delivery(3, 9);
      manager.delivery(4, 9);
      manager.delivery(5, 9);
      manager.delivery(6, 9);
      manager.delivery(7, 9);
      manager.delivery(8, 9);
      manager.delivery(9, 9);
     
    }
    
    /**
     * Show details of the given product and if it is found then
     * the product name and quantity will be displayed.
     */
    public void showDetails(int id)
    {
        manager.printProductDetails(id);
    }
    
    /**
     * Sell one item.
     */
    public void sellProduct(int id)
    {
        
        if(manager.findProduct(id) != null) 
        {
            manager.printProductDetails(id);
            manager.sellQuantity(id);
            manager.printProductDetails(id);
        }
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
    
}