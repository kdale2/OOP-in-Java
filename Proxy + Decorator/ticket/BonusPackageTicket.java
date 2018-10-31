package ticket;

public class BonusPackageTicket implements ITicket {
	
	//this ticket adds 50 to price
	
	private ITicket ticket;
	
	public BonusPackageTicket(ITicket ticket) {
		this.ticket=ticket;
	}

	@Override
	public int getPrice() {
		return 130;
	}

	@Override
	public String getSummary() {
		return "Pearl Jam + Bonus Package";
	}
}
