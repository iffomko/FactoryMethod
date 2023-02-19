package org.example.coffee.ItalianStyle;

import org.example.coffee.Coffee;

import static java.lang.Thread.sleep;

/**
 * Раф в Итальянском стиле
 */
public class ItalianRaf implements Coffee {
    ItalianRaf() {}
    /**
     * Метод, который готовит кофе
     */
    public void prepareCoffee() {
        try {
            System.out.println("Высыпаю молотый кофе в турку");
            System.out.println("Вливаю 60мл воды в турку");
            System.out.println("Добавляю сахар\n");
            System.out.println("Варю кофе...\n");

            sleep(1000);

            System.out.println("Выливаю сваренный экспрессе в стакан");
            System.out.println("Добавляю 120мл сливок");
            System.out.println("Успех! Раф в Итальянском стиле приготовлено!");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод, который нальет кофе в стакан
     */
    public void pourCoffee() {
        System.out.println("Наливаю Раф в стакан");
    }
}
