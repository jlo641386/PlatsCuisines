package fr.uppa.platscuisines.models;

/**
 * Created by mbsanchez on 21/02/2018.
 */

public class Dish {
    private String nomPlat;
    private int conditionnePour2;
    private int conditionnePour4;
    private int conditionnePour6;
    private int conditionnePour8;
    private int conditionnePour12;

    public Dish() {
    }

    public String getNomPlat() {
        return nomPlat;
    }

    public void setNomPlat(String nomPlat) {
        this.nomPlat = nomPlat;
    }

    public int getConditionnePour2() {
        return conditionnePour2;
    }

    public void setConditionnePour2(int conditionnePour2) {
        this.conditionnePour2 = conditionnePour2;
    }

    public int getConditionnePour4() {
        return conditionnePour4;
    }

    public void setConditionnePour4(int conditionnePour4) {
        this.conditionnePour4 = conditionnePour4;
    }

    public int getConditionnePour6() {
        return conditionnePour6;
    }

    public void setConditionnePour6(int conditionnePour6) {
        this.conditionnePour6 = conditionnePour6;
    }

    public int getConditionnePour8() {
        return conditionnePour8;
    }

    public void setConditionnePour8(int conditionnePour8) {
        this.conditionnePour8 = conditionnePour8;
    }

    public int getConditionnePour12() {
        return conditionnePour12;
    }

    public void setConditionnePour12(int conditionnePour12) {
        this.conditionnePour12 = conditionnePour12;
    }
}
