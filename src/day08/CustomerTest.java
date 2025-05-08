package day08;

//將重複的東西 寫成物件 減少重複寫的代碼 與TicketTest
public class CustomerTest {
	public static void main(String[] args) {
		Customer alice = new Customer("Alice", 2000);
		Ticket ticket1 = new BusinessTicket();
		Ticket ticket2 = new NonReservedTicket();
		alice.buyTicket(ticket1);
		alice.buyTicket(ticket2);
		
	}
}
