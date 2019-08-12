package rentalstore1;

import java.util.List;

public class HtmlStatement extends Statement{

    protected String getContent(Rental each) {
        return "\t" + each.getMovie().getTitle() + ":" + each.getCharge() + "<BR>\n";

    }

    protected String getHeader(Customer customer) {
        return "<H1>Rental Record for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    protected double getTotalAmount(List<Rental> rentals){
        return rentals.stream().mapToDouble(Rental::getCharge).sum();
    }
    protected String getFooterLine(double totalAmount, int frequentRenterPoints) {
        String footer = "<P>You owe<EM>"+ totalAmount+"</EM><P>\n";
        footer += "On this rental you earned <EM>"+frequentRenterPoints+"</EM> frequent renter points<P>";
        return footer;
    }
}
