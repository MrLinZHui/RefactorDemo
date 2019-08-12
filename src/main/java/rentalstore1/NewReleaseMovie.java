package rentalstore1;

public class NewReleaseMovie extends Movie{
    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    protected double getDayRented(int dayRented) {
        return dayRented * 3;
    }
}
