import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingSystem {
    private List<Customer> customers;
    private Map<String, ElectricityUsage> usageRecords;

    public BillingSystem() {
        customers = new ArrayList<>();
        usageRecords = new HashMap<>();
    }

    public void addCustomer(String customerId, String name, String address) {
        Customer customer = new Customer(customerId, name, address);
        customers.add(customer);
    }

    public void addUsage(String customerId, double unitsConsumed) {
        ElectricityUsage usage = new ElectricityUsage(customerId, unitsConsumed);
        usageRecords.put(customerId, usage);
    }

    public double calculateBill(String customerId) {
        ElectricityUsage usage = usageRecords.get(customerId);
        if (usage == null) {
            return 0;
        }
        double unitsConsumed = usage.getUnitsConsumed();
        double ratePerUnit = 5.0; // Example rate per unit
        return unitsConsumed * ratePerUnit;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public ElectricityUsage getUsage(String customerId) {
        return usageRecords.get(customerId);
    }
}
