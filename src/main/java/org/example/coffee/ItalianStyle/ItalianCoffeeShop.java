package org.example.coffee.ItalianStyle;

import org.example.coffee.*;
import org.example.coffee.coffeeShop.CoffeeShop;

/**
 * Сеть кафе в Итальянском стиле
 */
public class ItalianCoffeeShop extends CoffeeShop {
    /**
     * Создает конкретную реализацию кофе (фабричный метод)
     *
     * @param type - тип кофе
     * @return - объект определенного типа
     */
    protected Coffee createCoffee(CoffeeType type) throws Exception {
        switch (type) {
            case AMERICANO:
                return new ItalianAmericano();
            case LATTE:
                return new ItalianLatte();
            case RAF:
                return new ItalianRaf();
            default:
                throw new Exception("Такого кофе нет, можете выбрать что-то, что есть в нашем ассортименте");
        }
    }
}
