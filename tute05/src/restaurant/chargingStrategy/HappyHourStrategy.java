package restaurant.chargingStrategy;

import java.util.List;

import restaurant.Meal;

/**
 * Happy Hour - where registered members get a 40% discount, while standard customers get 30%
 */
public class HappyHourStrategy implements ChargingStrategy {
    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        if (payeeIsMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        }
    }

    @Override
    public double standardChargeModifier() {
        return 0.7;
    }
}