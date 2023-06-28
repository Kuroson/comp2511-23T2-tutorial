package restaurant.chargingStrategy;

import java.util.List;

import restaurant.Meal;

/**
 * Standard - normal rates
 */
public class StandardStrategy implements ChargingStrategy {
    /**
     * The cost of a meal.
     */
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    /**
     * Modifying factor of charges for standard customers.
     */
    public double standardChargeModifier() {
        return 1;
    }

}
