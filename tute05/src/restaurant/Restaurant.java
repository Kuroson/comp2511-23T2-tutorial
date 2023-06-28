package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.chargingStrategy.*;

public class Restaurant {
    private ChargingStrategy chargingStrategy = new StandardStrategy(); // By default
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();

    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("tute05/src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public double cost(List<Meal> order, String payee) {
        return this.chargingStrategy.cost(order, this.members.contains(payee));
    }

    public void displayMenu() {
        double modifier = this.chargingStrategy.standardChargeModifier();

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public void changeStrategy(String name) {
        if (name.equals("Standard")) {
            this.chargingStrategy = new StandardStrategy();
        } else if (name.equals("Holiday")) {
            this.chargingStrategy = new HolidayStrategy();
        }
    }

    public void addMember(String member) {
        members.add(member);
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();
        r.changeStrategy("Holiday");
        System.out.println("");
        r.displayMenu();
    }
}