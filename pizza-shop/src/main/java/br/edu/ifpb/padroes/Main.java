package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.decorator.*;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.service.PizzaShopService;

public class Main {

    public static void main(String[] args) {

        PizzaShopService pizzaShopService = new PizzaShopService();

        System.out.println("Pizzas - MENU");

        for (Pizza pizza: pizzaShopService.getPizzas()) {
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getPrice()));
        }

        Pizza pizza = new PizzaShopPizza("pepperoni", 55.0f);

        PizzaDecoratorImp pizzaDecorator = new DiscountCuponDecorator(
                new ExtraCheeseDecorator(
                        new PanPizzaDecorator(
                                new StuffedCrustDecorator(
                                        new PizzaDecoratorImp(pizza)
                                )
                        )
                )
        );

        pizzaShopService.orderPizza(pizzaDecorator);

    }

}
