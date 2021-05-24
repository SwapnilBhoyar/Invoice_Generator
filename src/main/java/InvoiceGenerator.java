public class InvoiceGenerator {
    private final int COST_PER_KM = 10;
    private final int COST_PER_MINUTE = 1;
    public int MIN_FARE = 5;
    double totalFare;

    public double CalculateFare(double DISTANCE, int TIME) {

        totalFare = COST_PER_KM * DISTANCE + COST_PER_MINUTE * TIME;
        if(totalFare < MIN_FARE)
            totalFare = MIN_FARE;
        return totalFare;
    }
}
