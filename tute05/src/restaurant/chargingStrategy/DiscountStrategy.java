package restaurant.chargingStrategy;

import java.util.List;

import restaurant.Meal;

/**
 * Discount - where registered members get a 15% discount and standard customers pay normal prices
 */
public class DiscountStrategy implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return 0;
    }

    @Override
    public double standardChargeModifier() {
        return 0;
    }

}