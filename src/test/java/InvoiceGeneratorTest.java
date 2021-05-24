import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    void givenDistanceAndTimeShouldReturnFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double Fare = invoiceGenerator.CalculateFare(7.0, 8);
        Assertions.assertEquals(78, Fare);
    }

    @Test
    void givenDistanceAndTimeShouldReturnMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double TotalFare = invoiceGenerator.CalculateFare(0.5, 3);
        Assertions.assertEquals(8, TotalFare);
    }
}
