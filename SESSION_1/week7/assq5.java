package SESSION_1.week7;
public class assq5 {

    private double[] prices;
    private int count;
    private final String cartId;

    assq5(String cartId, int size) {
        this.cartId = cartId;
        prices = new double[size];
        count = 0;
    }

    void addItem(double price) {

        if (count < prices.length) {
            prices[count] = price;
            count++;
        }
    }

    double getTotal() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total = total + prices[i];
        }

        return total;
    }

    int getItemCount() {
        return count;
    }

    public static void main(String[] args) {

        assq5 cart = new assq5("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}