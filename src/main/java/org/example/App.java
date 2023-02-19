package org.example;

import org.example.coffee.CoffeeType;
import org.example.coffeeShop.AmericanCoffeeShop;
import org.example.coffeeShop.CoffeeShop;
import org.example.coffeeShop.ItalianCoffeeShop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
            CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();

            americanCoffeeShop.orderCoffee(CoffeeType.AMERICANO);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
