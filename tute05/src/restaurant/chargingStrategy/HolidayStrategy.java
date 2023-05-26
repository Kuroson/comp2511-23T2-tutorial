package restaurant.chargingStrategy;

import java.util.List;

import restaurant.Meal;

/**
 * Holiday - 15% surcharge on all items for all customers
 */
public class HolidayStrategy implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return 0;
    }

    @Override
    public double standardChargeModifier() {
        return 0;
    }
}