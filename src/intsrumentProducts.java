public class intsrumentProducts extends Product{ // todo Liskov substitution principle - расширяет возможности Product в связи с наличием доп. параметров и особенностей класса
    private boolean inMetal;

    public intsrumentProducts(String name, int price, String countryMaker, boolean inMetal) { // todo Open-Closed principle - можем добавить доп.элемент, но сохраняем при этом основной функционал
        super(name, price, countryMaker);
        this.inMetal = inMetal;
    }

    public String controlInMetal(boolean inMetal) { // todo Open-Closed principle - добавляем доп.метод без ущерба для функционала
        if (inMetal) {
            return "металлический объект";
        }
        return "неметаллический объект";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Инструмент относится к категории - %s.", controlInMetal(inMetal));
    }
}


