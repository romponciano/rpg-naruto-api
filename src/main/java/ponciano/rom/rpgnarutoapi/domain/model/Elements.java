package ponciano.rom.rpgnarutoapi.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    private Double water;
    private Double fire;
    private Double earth;
    private Double thunder;
    private Double wind;
    private List<String> main;

    public Elements(Double water, Double fire, Double earth, Double thunder, Double wind, List<String> main) {
        setWater(water);
        setFire(fire);
        setEarth(earth);
        setThunder(thunder);
        setWind(wind);
        setMain(main);
    }

    public Elements() {
        setWater(null);
        setFire(null);
        setEarth(null);
        setThunder(null);
        setWind(null);
    }

    public Double getWater() {
        return water;
    }

    public void setWater(Double water) {
        this.water = water == null ? 0 : water;
    }

    public Double getFire() {
        return fire;
    }

    public void setFire(Double fire) {
        this.fire = fire == null ? 0 : fire;
    }

    public Double getEarth() {
        return earth;
    }

    public void setEarth(Double earth) {
        this.earth = earth == null ? 0 : earth;
    }

    public Double getThunder() {
        return thunder;
    }

    public void setThunder(Double thunder) {
        this.thunder = thunder == null ? 0 : thunder;
    }

    public Double getWind() {
        return wind;
    }

    public void setWind(Double wind) {
        this.wind = wind == null ? 0 : wind;
    }

    public List<String> getMain() {
        return main;
    }

    public void setMain(List<String> main) {
        this.main = main == null ? new ArrayList<>() : main;
    }
}
