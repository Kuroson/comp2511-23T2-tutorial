package restaurant.chargingStrategy;

import java.util.List;

import restaurant.Meal;

/**
 * Holiday - 15% surcharge on all items for all customers
 */
public class HolidayStrategy implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
    }

    @Override
    public double standardChargeModifier() {
        return 1.15;
    }
}