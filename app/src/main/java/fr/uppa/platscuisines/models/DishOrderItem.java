package fr.uppa.platscuisines.models;

/**
 * Created by mbsanchez on 01/03/2018.
 */

public class DishOrderItem {
    private int id;
    private String dishName;
    private int quantityFor2;
    private int quantityFor4;
    private int quantityFor6;
    private int quantityFor8;
    private int quantityFor12;

    public DishOrderItem(int id, String dishName, int quantityFor2, int quantityFor4, int quantityFor6, int quantityFor8, int quantityFor12) {
        this.id = id;
        this.dishName = dishName;
        this.quantityFor2 = quantityFor2;
        this.quantityFor4 = quantityFor4;
        this.quantityFor6 = quantityFor6;
        this.quantityFor8 = quantityFor8;
        this.quantityFor12 = quantityFor12;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getQuantityFor2() {
        return quantityFor2;
    }

    public void setQuantityFor2(int quantityFor2) {
        this.quantityFor2 = quantityFor2;
    }

    public int getQuantityFor4() {
        return quantityFor4;
    }

    public void setQuantityFor4(int quantityFor4) {
        this.quantityFor4 = quantityFor4;
    }

    public int getQuantityFor6() {
        return quantityFor6;
    }

    public void setQuantityFor6(int quantityFor6) {
        this.quantityFor6 = quantityFor6;
    }

    public int getQuantityFor8() {
        return quantityFor8;
    }

    public void setQuantityFor8(int quantityFor8) {
        this.quantityFor8 = quantityFor8;
    }

    public int getQuantityFor12() {
        return quantityFor12;
    }

    public void setQuantityFor12(int quantityFor12) {
        this.quantityFor12 = quantityFor12;
    }
}
