package rentalstore1;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }
    public  double getCharge(){
        return this.getMovie().getDayRented(dayRented);
    }

    int getFrequentRenterPoints(int frequentRenterPoints) {
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDayRented() > 1) {
            return 2;
        }
        return 1;
    }
}
