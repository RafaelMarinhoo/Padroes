package br.edu.ifpb.padroes.storewebv3.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.facade.OrderFacade;
import br.edu.ifpb.padroes.storewebv3.service.command.MakeOrderCommand;
import br.edu.ifpb.padroes.storewebv3.service.command.Invocador;

@RestController
@RequestMapping("/api/order")
public class OrderResource {

    private final OrderFacade orderFacade;
    private final Invocador invocador;

    public OrderResource(OrderFacade orderFacade, Invocador invocador) {
    	this.orderFacade = orderFacade;
    	this.invocador = invocador;
    }

    @PostMapping("/")
    public ResponseEntity<Void> createOrder(@RequestBody Order order) {
        MakeOrderCommand c = new MakeOrderCommand(orderFacade);
        c.setOrder(order);
        this.invocador.addCommand(c);
        this.invocador.executeCommands();
        return ResponseEntity.ok().build();
    }

}
