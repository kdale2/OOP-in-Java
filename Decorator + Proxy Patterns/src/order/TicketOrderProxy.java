package order;

import ticket.ITicket;

public class TicketOrderProxy implements ITicketOrder {

	private TicketOrder ticketOrder;
	private int quantity;
	private IApiCaller apiCaller;    
	
	public TicketOrderProxy(ITicket ticket, int quantity, IApiCaller apiCaller) {
		this.apiCaller = apiCaller;
		this.quantity = quantity;
		ticketOrder = new TicketOrder(ticket, quantity, apiCaller);
		
	}

	@Override
	public void submitTicketOrder() {	
		ticketOrder.submitTicketOrder();
	}

	@Override
	public String getOrderNumber() {	
		return ticketOrder.getOrderNumber();
	}

}
