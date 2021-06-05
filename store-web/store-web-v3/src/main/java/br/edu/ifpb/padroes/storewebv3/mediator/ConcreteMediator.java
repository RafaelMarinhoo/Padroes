package br.edu.ifpb.padroes.storewebv3.mediator;

import br.edu.ifpb.padroes.storewebv3.payment.StripeApi;
import br.edu.ifpb.padroes.storewebv3.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConcreteMediator implements Mediator {

	@Autowired
	private StripeApi stripeApi;
	@Autowired
	private OrderService orderService;

	@Override
	public void notify(Componente componente) {
		if (componente instanceof OrderService) {
			this.reagirOrderService();
		}
	}

	public void reagirOrderService() {
		this.stripeApi.createOrder(null);
	}
}
