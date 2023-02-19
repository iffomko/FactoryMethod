package org.example.coffeeShop;

import org.example.coffee.*;

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
        switch (type) {
            case AMERICANO:
                return new AmericanAmericano();
            case LATTE:
                return new AmericanLatte();
            case RAF:
                return new AmericanRaf();
            default:
                throw new Exception("Такого кофе нет, можете выбрать что-то, что есть в нашем ассортименте");
        }
    }
}
