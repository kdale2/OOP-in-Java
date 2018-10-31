package findOrderStrategy;

public class FindOrderStrategyFactory {
	
	private FindOrderStrategyFactory() {}
	
    public static IFindOrderStrategy getFindByRewardsNumberStrategy() {
        return new RewardsNumber();
    }
    
    public static IFindOrderStrategy getFindByLastNameStrategy() {
      return new LastName();
    }

    public static IFindOrderStrategy getFindByOrderNumberStrategy() {        
      return new OrderNumber();
    }
}
