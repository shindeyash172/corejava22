package com.aurionpro.test;

import java.util.ArrayList;
import com.aurionpro.model.LineItems;

public class lineItemsTest {
    public static void main(String[] args) {
        ArrayList<LineItems> items = new ArrayList<>();

        items.add(new LineItems(1, "Boat", 5, 10.0));
        items.add(new LineItems(2, "Noise", 3, 8.5));
        items.add(new LineItems(3, "Apple", 2, 15.0));

        double totalCartValue = 0.0;
        for (LineItems item : items) {
            totalCartValue += item.getTotalCost();
        }

        System.out.println("List of Line Items and their Total Costs:");
        for (LineItems item : items) {
            System.out.println("Item ID: " + item.getId() +", Name: " + item.getName() +", Total Cost: " + item.getTotalCost());
        }

        System.out.println("Total Cart Value: " + totalCartValue);
    }
}
