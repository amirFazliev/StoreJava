public class Main {
    public static void main(String[] args) {
        Store store = new ProductsStore();

        Product product1 = new Product("Soap", 50, "Russia");
        store.inBacket(product1);
        printer(); // todo Правило DRY - исключаем повторение раздилителя через sout

        Product product2 = new homeProducts("Oranges", 100, "Monako", 2); // todo Dependency inversion principle - зависим от интерфейса, а не от класса
        store.inBacket(product2);
        printer(); // todo Правило DRY -//-

        Product product3 = new intsrumentProducts("Molotok", 100_000, "China", true); // todo Dependency inversion principle - зависим от интерфейса, а не от класса
        store.inBacket(product3);
        printer(); // todo Правило DRY -//-

        store.allproducts();
        printer(); // todo Правило DRY -//-

        Product product4 = new Product("Telefon", 5000, "USA");
        store.inBacket(product4);
        printer(); // todo Правило DRY -//-

        Product product5 = new homeProducts("Mango", 1000, "Egypt", 2); // todo Dependency inversion principle - зависим от интерфейса, а не от класса
        store.inBacket(product5);
        printer(); // todo Правило DRY -//-

        Product product6 = new intsrumentProducts("Gvozd", 100, "Russia", true); // todo Dependency inversion principle  - зависим от интерфейса, а не от класса
        store.inBacket(product6);
        printer(); // todo Правило DRY -//-

        store.deleteProductInBacket(product3);
        printer(); // todo Правило DRY -//-

        store.allproducts();
        printer(); // todo Правило DRY -//-
        System.out.printf("Итого к оплате - %d рублей", store.productsPay());
    }

    public static void printer() {
        System.out.println("_______________________________________________________");
    }
}