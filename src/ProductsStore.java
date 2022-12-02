import java.util.LinkedList;
import java.util.List;

public class ProductsStore implements Store {
    final int maxProductsInBasketValue = 5;
    List<Product> productList = new LinkedList<>();
    @Override
    public void allproducts() { // todo Single-responsibility principle - вывод всех набранных товаров
        System.out.println("Список всех набранных продуктов");
        productList.forEach(System.out::println);
    }

    @Override
    public void inBacket (Product product) { // todo Single-responsibility principle - добавляет товар в корзину покупок
        System.out.println("В корзину покупок добавлен - " + product);
        productList.add(product);
        maxProductsInBasketControl(); // todo Правило DRY - исключаем повторение действий выполняемых методом
    }

    @Override
    public void deleteProductInBacket(Product product) { // todo Single-responsibility principle - удаляет товар из корзины покупок
        if (productList.remove(product)){
            System.out.printf("Товар %s удален из корзины покупок.\n", product.getName());
            return;
        }
        System.out.printf("Товар %s в корзине покупок не значится.\n", product.getName());
    }

    @Override
    public int productsPay() { // todo Single-responsibility principle - выводит только итоговую сумму набранных товаров
        int allSum = 0;
        for (Product product : productList) {
            allSum+=product.getPrice();
        }
        return allSum;
    }

    @Override
    public void maxProductsInBasketControl() { // todo Single-responsibility principle - осуществляет проверку максимальное количества товаров в корзине
        if(maxProductsInBasketValue <= productList.size()){ // todo Правило Magic:
            // количество помещенных объектов в productList.size() и переменная maxProductsInBasketValue не прописывается напрямую.
            System.out.println("Недопустимое количество товаров в корзине покупок.");
        }
    }

}
