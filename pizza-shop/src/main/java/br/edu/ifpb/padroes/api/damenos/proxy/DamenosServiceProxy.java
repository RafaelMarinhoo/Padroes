package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do m…todo
public class DamenosServiceProxy implements DamenosService {
    private DamenosServiceImpl damenosService;
    private List<DamenosPizza> pizzas = new ArrayList<>();

    public DamenosServiceProxy(DamenosServiceImpl damenosService) {
        this.damenosService = damenosService;
    }

    @Override
    public List<DamenosPizza> getPizzas() {
        if (pizzas.isEmpty()) {
            this.pizzas = damenosService.getPizzas();
        }

        return this.pizzas;
    }
}