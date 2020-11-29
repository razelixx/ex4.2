/*  Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
    У каждой сладости есть название, вес, цена и свой уникальный параметр.
    Необходимо собрать подарок из сладостей.
    Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке. */

import present.Candy;
import present.Jellybean;

public class Main {
    public static void main(String[] args) {
        Jellybean firstJelly = new Jellybean("Золотой степ", 200, 50);
        Jellybean secondJelly = new Jellybean("Snikers", 500, 200);
        Candy firstCandy = new Candy("Молочная речка", 300, 40);
        Candy secondCandy = new Candy("Toblerone", 500, 500);

        int sumWeight = firstJelly.getWeight() + secondJelly.getWeight() + firstCandy.getWeight() + secondCandy.getWeight();
        int sumPrice = firstJelly.getPrice() + secondJelly.getPrice() + firstCandy.getPrice() + secondCandy.getPrice();

        System.out.println(firstCandy);
        System.out.println(secondCandy);
        System.out.println(firstJelly);
        System.out.println(secondJelly);
        System.out.println("Общий вес подарка: " + sumWeight);
        System.out.println("Общая стоимость подарка: " + sumPrice);
    }
}
