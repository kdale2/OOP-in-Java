package findOrderStrategy;

import orders.Order;

public class RewardsNumber implements IFindOrderStrategy {
	
	@Override
	public String getFindByAttribute(Order order) {
		return order.getRewardsMemberNumber();
	}
}
