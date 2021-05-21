package lt.bit.p0520;

public class LygiavimoUzdavinys {

    public static void main(String[] args) {
        System.out.println(LygiavimoUzdavinys.class.getName());

        lt.bit.p0520.ProductService productService = new lt.bit.p0520.ProductService();
        lt.bit.p0520.Product[] products = productService.getProducts();

        productService.sort(products);

        print(products);
    }

    static void print(lt.bit.p0520.Product[] products) {
        for (lt.bit.p0520.Product p : products) {
            System.out.println(p.isValid() + " " + p.getQty() + " " + p.getName());
        }
    }

}