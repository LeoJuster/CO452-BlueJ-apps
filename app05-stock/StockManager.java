import java.util.ArrayList;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Leo Juster 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        stock.get(id).increaseQuantity(amount);
    }

    /**
     * A restock product method.
     * Gets id and increase quantity by 5. 
     */
    public void restock()
    {
        for (Product product : stock)
        {
            if(product.getQuantity() <= 5  )
            {
                stock.get(product.getID()).increaseQuantity(5);
            }   
        }     
    }

    /**
     * Sell a product by it's ID.
     * Decrease the quantity of the product by the given amount.
     * @param id The ID of the product.
     */
    public void sellQuantity(int id)
    {
        stock.get(id).sellOne();
    }    

    /**
     * Renaming the product. The product id and also
     * setting the parameters of them.
     * @param int id and String name. 
     */
    public void renameProduct(int id, String name)
    {
        stock.get(id).renameProducts(name);
    }    

    /**
     * Remove product method.
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if (product == null)
        {
            System.out.println("Product ID" + " " + id + " Not found" );

        }   
        else 
        {
            stock.remove(product);
            System.out.println("Product " + product + "has been removed");
        }
    }    

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails(int id)
    {
        System.out.println(stock.get(id).toString());
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {   
        for (Product product : stock)
        {
            if(product.getID() ==id)
            {
                return product;
            }   
        }   
        System.out.println("Product not found");
        return null;
    }

    /**
     * A search method for products with the parameter (String)
     */
    public void search(String name)
    {
        int counter = 0;
        
        for (Product product : stock)
        {
            String productname = product.getName();
            if(productname.contains(name))
            { 
                printProductDetails(product.getID()); 
                counter++;
            }   
        }
        if (counter == 0)
        {
            System.out.print("Product not found");
        }    
    }
    
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Leo's Stock List");
        System.out.println("================="); 
        System.out.println(); 

        if(stock.size() == 0)
        {
            System.out.println("Currently No Stock!");
        } 
        else 
        {
            for(Product product : stock)
            {
                System.out.println(product);
            }   
        }  
    }

    /**
     * This is a method that prints a statement
     * when the stock level runs low.
     */

    public void displaylowstock()
    {
        int count = 0;
        while (stock.size() > count) {
            int stocklevel = stock.get(count).getQuantity();
            if (stocklevel <5) {
                System.out.println (stock.toString());
            } 
            count++;

        }
    }    
}