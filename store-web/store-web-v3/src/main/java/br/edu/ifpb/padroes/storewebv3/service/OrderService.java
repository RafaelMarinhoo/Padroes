package br.edu.ifpb.padroes.storewebv3.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.ifpb.padroes.storewebv3.mediator.Componente;
import br.edu.ifpb.padroes.storewebv3.mediator.ConcreteMediator;
import br.edu.ifpb.padroes.storewebv3.mediator.Mediator;
import br.edu.ifpb.padroes.storewebv3.domain.DescontoVisitor;
import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.OrderItem;
import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.OrderRepository;

@Service
public class OrderService implements Componente {

	private Mediator mediator;

	private OrderRepository orderRepository = OrderRepository.getInstance();

	public void createOrder(Order order) {

		for (OrderItem item : order.getItems()) {
			Product product = item.getProduct();
			product.accept(new DescontoVisitor());
		}
		mediator.notify(this);
		System.out.println(order.getId().toString());
	}

	public List<Order> getOrderList() {
		return orderRepository.getOrderList();
	}

	@Autowired
	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;

	}

}
