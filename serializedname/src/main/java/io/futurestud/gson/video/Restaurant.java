package io.futurestud.gson.video;

import java.util.List;

/**
 * Created by norman on 4/28/17.
 */
public class Restaurant {
    String name;

    List<RestaurantMenuItem> items;

    public Restaurant(String name, List<RestaurantMenuItem> items) {
        this.name = name;
        this.items = items;
    }

    public static class RestaurantMenuItem {
        String name;
        float price;

        public RestaurantMenuItem(String name, float price) {
            this.name = name;
            this.price = price;
        }
    }
}
