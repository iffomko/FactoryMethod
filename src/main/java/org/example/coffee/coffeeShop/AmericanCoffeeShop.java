package org.example.coffee.coffeeShop;

import org.example.coffee.*;
import org.example.coffee.AmericanStyle.AmericanAmericano;
import org.example.coffee.AmericanStyle.AmericanLatte;
import org.example.coffee.AmericanStyle.AmericanRaf;
import org.example.coffee.coffeeShop.CoffeeShop;

/**
 * Сеть кафе в Американском стиле (фабрика)
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
            case AMERICANO -> AmericanAmericano.getCoffee();
            case LATTE -> AmericanLatte.getCoffee();
            case RAF -> AmericanRaf.getCoffee();
            default -> throw new Exception("Такого кофе нет, можете выбрать что-то, что есть в нашем ассортименте");
        };
    }
}
