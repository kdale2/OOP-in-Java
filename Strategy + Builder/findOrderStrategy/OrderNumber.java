package findOrderStrategy;

import orders.Order;

public class OrderNumber implements IFindOrderStrategy {

	@Override
	public String getFindByAttribute(Order order) {
		return order.getOrderNumber();		
	}
}
