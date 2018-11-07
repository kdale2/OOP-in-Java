package findOrderStrategy;
import orders.Order;

public class LastName implements IFindOrderStrategy {

	@Override
	public String getFindByAttribute(Order order) {
		return order.getLastName();
	}
}
