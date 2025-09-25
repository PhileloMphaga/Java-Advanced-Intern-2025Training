package Chapter8;

public class Product {

    private String code;
    private String description;
    private double price;
    private int quantityInStock;



    public Product(String code, String description, double price, int quantityInStock) {
        setCode(code);
        setDescription(description);
        setPrice(price);
        setQuantityInStock(quantityInStock);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() < 5) {
            throw new IllegalArgumentException("Description should be at least 5 characters long." +
                    "\nCurrent description: [" + description + "]");
        }
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be zero / negative." +
                    "\nCurrent price: [" + price + "]");
        }
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void sell(int quantity) throws LowStockException {
        if (quantity > quantityInStock) {
            throw new LowStockException("Not enough quantity to sell." + getDescription() +
                    ".\nCurrent in stock : " + getQuantityInStock() +
                    "\nRequested quantity to sell: " + quantity);
        }
        this.quantityInStock -= quantity;
    }


    public void increasePrice(double percentage) {

        double increase = this.price * (percentage / 100);
        if (increase >= 10) {
            throw new HighPriceIncreaseException("The price increase on " + getDescription() +
                    " is too high [" + increase + "]" +
                    "\nThe increase should be less than 10.00");
        }
        this.price += increase;
    }

    @Override
    public String toString() {
        return String.format("""
                        
                        ===== Product Details for %s [%s] ===== 
                        
                        code:%s
                        description:%s
                        price:%s
                        quantityInStock:%d""", getDescription(), getCode(),
                getCode(), getDescription(), getPrice(), getQuantityInStock());


    }
}
