public class ElectricityUsage {
    private String customerId;
    private double unitsConsumed;

    public ElectricityUsage(String customerId, double unitsConsumed) {
        this.customerId = customerId;
        this.unitsConsumed = unitsConsumed;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    
    public String toString() {
        return "ElectricityUsage{" +
                "customerId='" + customerId + '\'' +
                ", unitsConsumed=" + unitsConsumed +
                '}';
    }
}
