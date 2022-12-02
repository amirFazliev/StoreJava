import java.util.List;

public interface Store { //
    void allproducts();
    void inBacket(Product product);

    void deleteProductInBacket(Product product);
    int productsPay();

    void maxProductsInBasketControl();

}
