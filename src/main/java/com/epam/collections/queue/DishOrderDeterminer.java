package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        List<Integer> inList = new ArrayList<>();
        if (numberOfDishes > 0) {
            for (int i = 1; i <= numberOfDishes; i++)
                inList.add(i);
            int count = 0;
            while (inList.size() > 1) {
                count += everyDishNumberToEat;
                if (count > inList.size()) {
                    count -= inList.size() + 1;
                } else
                    count--;
                result.add(inList.remove(count));
            }
            result.add(inList.get(0));
        }

        return result;
    }
}