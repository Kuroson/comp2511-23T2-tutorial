package restaurant.chargingStrategy;

import java.util.List;

import restaurant.Meal;

/**
 * Happy Hour - where registered members get a 40% discount, while standard customers get 30%
 */
public class HappyHourStrategy implements ChargingStrategy {
    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return 0;
    }

    @Override
    public double standardChargeModifier() {
        return 0;
    }
}