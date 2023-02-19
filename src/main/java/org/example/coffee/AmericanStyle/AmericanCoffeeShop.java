package org.example.coffee.AmericanStyle;

import org.example.coffee.*;
import org.example.coffee.coffeeShop.CoffeeShop;

/**
 * Сеть кафе в Американском стиле
 */
public class AmericanCoffeeShop extends CoffeeShop {
    /**
     * Создает конкретную реализацию кофе (фабричный метод)
     *
     * @param type - тип кофе
     * @return - объект определенного типа
     */
    protected Coffee createCoffee(CoffeeType type) throws Exception {
        return switch (type) {
            case AMERICANO -> new AmericanAmericano();
            case LATTE -> new AmericanLatte();
            case RAF -> new AmericanRaf();
            default -> throw new Exception("Такого кофе нет, можете выбрать что-то, что есть в нашем ассортименте");
        };
    }
}
