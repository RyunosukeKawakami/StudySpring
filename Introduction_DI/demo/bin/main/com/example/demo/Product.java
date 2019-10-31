import lombok.AllArgsConstructor;

/**
 * Product
 */
@AllArgsConstructor
public class Product {

    private String name;
    private int price;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    @Override
    public String toStirng(){
        return "Product [name = " +  name + ", price = " + price + "]";
    }
}