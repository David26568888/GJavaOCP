package day08;


//對號車票
public class ReservedTicket extends Ticket{
	public ReservedTicket() {
		price = 540;
	}

	@Override
	public void ticketInfo() {
		System.out.printf("🎫對號車票%d%n",price);
	}
	
	
}
