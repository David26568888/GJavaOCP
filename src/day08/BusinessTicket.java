package day08;


//商務車票
public class BusinessTicket extends Ticket{
	public BusinessTicket() {
		price = 1080;
	}

	@Override
	public void ticketInfo() {
		System.out.printf("🎫商務車票(有吃有喝)%d%n",price);
	}
	
	
}
