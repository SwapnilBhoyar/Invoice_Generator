import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    @Test
    void givenDistanceAndTimeShouldReturnFare() {
        double Fare = invoiceGenerator.calculateFare(7.0, 8);
        Assertions.assertEquals(78, Fare);
    }

    @Test
    void givenDistanceAndTimeShouldReturnMinimumFare() {
        double TotalFare = invoiceGenerator.calculateFare(0.5, 3);
        Assertions.assertEquals(8, TotalFare);
    }

    @Test
    void givenMltipleRidesShouldReturnTotalFare() {
        Ride[] rides = {new Ride(2.0, 5),
                        new Ride(0.1, 1)};
        Assertions.assertEquals(30, invoiceGenerator.calculateFareForMultipleRides(rides));
    }
}
