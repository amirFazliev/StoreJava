public class homeProducts extends Product { // todo Liskov substitution principle - расширяет возможности Product в связи с наличием доп. параметров и особенностей класса
    private int dataSaveProduct;

    public homeProducts(String name, int price, String countryMaker, int dataSaveProduct) { // todo Open-Closed principle - - можем добавить доп.элемент, но сохраняем при этом основной функционал
        super(name, price, countryMaker);
        this.dataSaveProduct = dataSaveProduct;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Срок годности составляет - %d месяца.", dataSaveProduct);
    }
}
