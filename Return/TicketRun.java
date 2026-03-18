class TicketRun{
	public static void main(String[] args) {
        System.out.println("Price by Place: " + Ticket.getPriceByPlace("Mandya"));
        System.out.println("Price by Movie: " + Ticket.getPriceByMovie("KGF", "Gold", "PVR"));
        System.out.println("Email: " + Ticket.getEmail("Abhishek"));
        System.out.println("Mobile: " + Ticket.getMobile("Abhishek"));
    }
}