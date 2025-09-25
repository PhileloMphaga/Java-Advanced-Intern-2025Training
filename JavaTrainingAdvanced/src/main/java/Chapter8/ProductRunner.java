package Chapter8;

import java.util.Scanner;

public class ProductRunner {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double price;
        int qty;

        try {
            System.out.print("Enter price: ");
            price = sc.nextDouble();

            System.out.println("Enter quantity: ");
            qty = sc.nextInt();
            Product objProd = new Product("CK200", "Coke Zero", price, qty);


            objProd.sell(5);
            objProd.increasePrice(5);

            System.out.println(objProd);
        }catch(IllegalArgumentException | LowStockException | HighPriceIncreaseException e) {
            System.err.println(e.getMessage());
        } finally{
            sc.close();
        }

    }
}
