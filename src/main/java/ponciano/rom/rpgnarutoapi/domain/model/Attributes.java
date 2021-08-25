package ponciano.rom.rpgnarutoapi.domain.model;

public class Attributes {
    private Integer strenght;
    private Integer spirit;
    private Integer resistence;
    private Integer carism;
    private Integer dexterity;
    private Integer intelligence;

    public Attributes(Integer strenght, Integer spirit, Integer resistence, Integer carism, Integer dexterity, Integer intelligence) {
        setStrenght(strenght);
        setSpirit(spirit);
        setResistence(resistence);
        setCarism(carism);
        setDexterity(dexterity);
        setIntelligence(intelligence);
    }

    public Attributes() {
        setStrenght(null);
        setSpirit(null);
        setResistence(null);
        setCarism(null);
        setDexterity(null);
        setIntelligence(null);
    }

    public Integer getStrenght() {
        return strenght;
    }

    public void setStrenght(Integer strenght) {
        this.strenght = strenght == null ? 0 : strenght;
    }

    public Integer getSpirit() {
        return spirit;
    }

    public void setSpirit(Integer spirit) {
        this.spirit = spirit == null ? 0 : spirit;
    }

    public Integer getResistence() {
        return resistence;
    }

    public void setResistence(Integer resistence) {
        this.resistence = resistence == null ? 0 : resistence;
    }

    public Integer getCarism() {
        return carism;
    }

    public void setCarism(Integer carism) {
        this.carism = carism == null ? 0 : carism;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity == null ? 0 : dexterity;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence == null ? 0 : intelligence;
    }
}
