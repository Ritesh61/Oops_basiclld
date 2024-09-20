package zomato.api.data;

import java.util.List;

public class Restaurant {

    private final int id;
    private final String name;
    private final String description;
    private final BusinessHours businessHours;
    private final MealType mealType;
    private final List<CuisineType> cuisineTypeList;
    private final StarRating starRating;
    private final Menu menu;
    private final Address address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BusinessHours getBusinessHours() {
        return businessHours;
    }

    public MealType getMealType() {
        return mealType;
    }

    public List<CuisineType> getCuisineTypeList() {
        return cuisineTypeList;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public Menu getMenu() {
        return menu;
    }

    public Address getAddress() {return address;}

    public Restaurant(int id, String name, String description, BusinessHours businessHours, MealType mealType, List<CuisineType> cuisineTypeList, StarRating starRating, Menu menu, Address address) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.businessHours = businessHours;
        this.mealType = mealType;
        this.cuisineTypeList = cuisineTypeList;
        this.starRating = starRating;
        this.menu = menu;
        this.address = address;
    }
}
