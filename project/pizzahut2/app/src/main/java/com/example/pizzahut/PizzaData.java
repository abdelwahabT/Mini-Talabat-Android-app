package com.example.pizzahut;

public class PizzaData {

    private String pizzaName;
    private String pizzaPrice;
    private Integer pizzaImage;

    public PizzaData(String pizzaName, String pizzaPrice, Integer pizzaImage) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaImage = pizzaImage;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(String pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public Integer getPizzaImage() {
        return pizzaImage;
    }

    public void setPizzaImage(Integer pizzaImage) {
        this.pizzaImage = pizzaImage;
    }
}
