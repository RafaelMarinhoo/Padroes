package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

//TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método

public class PizzaHotServiceProxy implements PizzaHotService {
	private PizzaHotServiceImpl pizzaHotService;
	private List<PizzaHotPizza> pizzas = new ArrayList<>();

	public PizzaHotServiceProxy(PizzaHotServiceImpl pizzaHotService) {
	    this.pizzaHotService = pizzaHotService;
	 }
	
	 @Override
	public List<PizzaHotPizza> getPizzas() {
	    System.out.println("Retornando o cache....");
	    // TODO - implementar proxy
	    if (this.pizzas.isEmpty()) {
	        this.pizzas = this.pizzaHotService.getPizzas();
	    }
	
	    return this.pizzas;
	 }
}
