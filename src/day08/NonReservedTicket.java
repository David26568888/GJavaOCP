package day08;


//自由車票
public class NonReservedTicket extends Ticket{
	public NonReservedTicket() {
		price = 510;
	}

	@Override
	public void ticketInfo() {
		System.out.printf("🎫自由車票(不保證有位子)%d%n",price);
	}
	
	
}
